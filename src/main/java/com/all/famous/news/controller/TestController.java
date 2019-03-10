package com.all.famous.news.controller;

import com.all.famous.news.model.entity.Article;
import com.all.famous.news.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TestController {

//    private final ArticleService articleService;

//    @Autowired
//    public TestController(ArticleService articleService) {
//        this.articleService = articleService;
//    }

    private final ArticleRepository articleRepository;

    @Autowired
    public TestController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/news")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Article> getAllNews() {
        return articleRepository.findAll();
    }

    @PostMapping("news")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void addNew(@RequestBody Article article) {
        articleRepository.save(article);
    }

}
