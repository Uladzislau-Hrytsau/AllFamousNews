package com.all.famous.news.controller;

import com.all.famous.news.model.dto.ArticleDto;
import com.all.famous.news.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ArticleController {

    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/article")
    @ResponseStatus(value = HttpStatus.OK)
    public List<ArticleDto> getAllArticleDto() {
        return articleService.findAllArticleDto();
    }

}
