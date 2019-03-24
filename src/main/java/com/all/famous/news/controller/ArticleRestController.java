package com.all.famous.news.controller;

import com.all.famous.news.model.Response;
import com.all.famous.news.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
     * @param size the size
     * @param page the page
     * @return the all article
     */
    @GetMapping(value = "/articles", params = {"size", "page"})
    @ResponseStatus(value = HttpStatus.OK)
    public Response getAllArticle(
            @RequestParam(value = "size") Integer size,
            @RequestParam(value = "page") Integer page) {
        return articleService.getArticlesBySizeAndOffset(size, page);
    }

    /**
     * Gets articles by size and offset and category id.
     *
     * @param size       the size
     * @param page       the page
     * @param categoryId the category id
     * @return the articles by size and offset and category id
     */
    @GetMapping(value = "/articles", params = {"size", "page", "categoryId"})
    @ResponseStatus(value = HttpStatus.OK)
    public Response getArticlesBySizeAndOffsetAndCategoryId(
            @RequestParam(value = "size") Integer size,
            @RequestParam(value = "page") Integer page,
            @RequestParam("categoryId") Long categoryId) {
        return articleService.getArticlesBySizeAndOffsetAndCategoryId(size, page, categoryId);
    }

    /**
     * Gets articles by size and offset and article name.
     *
     * @param size        the size
     * @param page        the page
     * @param articleName the article name
     * @return the articles by size and offset and article name
     */
    @GetMapping(value = "/articles", params = {"size", "page", "articleName"})
    @ResponseStatus(value = HttpStatus.OK)
    public Response getArticlesBySizeAndOffsetAndArticleName(
            @RequestParam(value = "size") Integer size,
            @RequestParam("page") Integer page,
            @RequestParam("articleName") String articleName) {
        return articleService.getArticlesBySizeAndOffsetAndArticleName(size, page, articleName);
    }


}
