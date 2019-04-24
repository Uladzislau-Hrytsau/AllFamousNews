package com.all.famous.news.service.implementation;

import com.all.famous.news.dao.ArticleDao;
import com.all.famous.news.model.Response;
import com.all.famous.news.model.dao.Article;
import com.all.famous.news.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Article service.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleDao articleDao;

    /**
     * Instantiates a new Article service.
     *
     * @param articleDao the article dao
     */
    @Autowired
    public ArticleServiceImpl(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @Override
    public Response getArticlesBySizeAndOffset(Integer size, Integer page) {
        Integer offset = size * --page;
        Response<Article> response = new Response<>();
        response.setData(articleDao.getArticlesBySizeAndOffset(size, offset));
        response.setCount(this.getCountArticles());
        return response;
    }

    @Override
    public Response getArticlesBySizeAndOffsetAndCategoryId(Integer size, Integer page, Long categoryId) {
        Integer offset = size * --page;
        Response<Article> response = new Response<>();
        response.setData(articleDao.getArticlesBySizeAndOffsetAndCategoryId(size, offset, categoryId));
        response.setCount(this.getCountArticlesByCategoryId(categoryId));
        return response;
    }

    @Override
    public Response getArticlesBySizeAndOffsetAndArticleName(Integer size, Integer page, String articleName) {
        Integer offset = size * --page;
        Response<Article> response = new Response<>();
        response.setData(articleDao.getArticlesBySizeAndOffsetAndArticleName(size, offset, articleName));
        response.setCount(this.getCountArticlesByTitle(articleName));
        return response;
    }

    @Override
    public Long getCountArticles() {
        return articleDao.getCountArticles();
    }

    @Override
    public Long getCountArticlesByCategoryId(Long categoryId) {
        return articleDao.getCountArticlesByCategoryId(categoryId);
    }

    @Override
    public Long getCountArticlesByTitle(String title) {
        return articleDao.getCountArticlesByTitle(title);
    }


}
