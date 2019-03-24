package com.all.famous.news.controller;

import com.all.famous.news.model.dto.ArticleDto;
import com.all.famous.news.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Article rest controller.
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ArticleRestController {

    private final ArticleService articleService;

    /**
     * Instantiates a new Article rest controller.
     *
     * @param articleService the article service
     */
    @Autowired
    public ArticleRestController(ArticleService articleService) {
        this.articleService = articleService;
    }

    /**
     * Gets all article.
     *
     * @param size   the size
     * @param offset the offset
     * @return the all article
     */
    @GetMapping(value = "/articles", params = {"size", "offset"})
    @ResponseStatus(value = HttpStatus.OK)
    public List<ArticleDto> getAllArticle(
            @RequestParam(value = "size") Integer size,
            @RequestParam(value = "offset") Integer offset) {
        return articleService.getArticlesBySizeAndOffset(size, offset);
    }

    /**
     * Gets articles by size and offset and category id.
     *
     * @param size       the size
     * @param offset     the offset
     * @param categoryId the category id
     * @return the articles by size and offset and category id
     */
    @GetMapping(value = "/articles", params = {"size", "offset", "categoryId"})
    @ResponseStatus(value = HttpStatus.OK)
    public List<ArticleDto> getArticlesBySizeAndOffsetAndCategoryId(
            @RequestParam(value = "size") Integer size,
            @RequestParam(value = "offset") Integer offset,
            @RequestParam("categoryId") Long categoryId) {
        return articleService.getArticlesBySizeAndOffsetAndCategoryId(size, offset, categoryId);
    }

    /**
     * Gets articles by size and offset and article name.
     *
     * @param size        the size
     * @param offset      the offset
     * @param articleName the article name
     * @return the articles by size and offset and article name
     */
    @GetMapping(value = "/articles", params = {"size", "offset", "articleName"})
    @ResponseStatus(value = HttpStatus.OK)
    public List<ArticleDto> getArticlesBySizeAndOffsetAndArticleName(Integer size, Integer offset, String articleName) {
        return articleService.getArticlesBySizeAndOffsetAndArticleName(size, offset, articleName);
    }

    /**
     * Gets number of articles by category id.
     *
     * @param categoryId the category id
     * @return the number of articles by category id
     */
    @GetMapping(value = "/articles", params = {"categoryId"})
    @ResponseStatus(value = HttpStatus.OK)
    public Integer getNumberOfArticlesByCategoryId(
            @RequestParam(value = "categoryId") Long categoryId) {
        return articleService.getNumberOfArticlesByCategoryId(categoryId);
    }

}
