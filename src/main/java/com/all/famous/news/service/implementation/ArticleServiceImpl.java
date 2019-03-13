package com.all.famous.news.service.implementation;

import com.all.famous.news.dao.ArticleDao;
import com.all.famous.news.model.dto.ArticleDto;
import com.all.famous.news.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<ArticleDto> getArticlesBySizeAndOffset(Integer size, Integer offset) {
        // TODO: validate size and offset
        return articleDao.getArticlesBySizeAndOffset(size, offset);
    }

    @Override
    public List<ArticleDto> getArticlesBySizeAndOffsetAndCategoryId(Integer size, Integer offset, Long categoryId) {
        // TODO: validate size, offset and identifier of category
        // TODO: replace the coded image name with a real image
        return articleDao.getArticlesBySizeAndOffsetAndCategoryId(size, offset, categoryId);
    }

    @Override
    public List<ArticleDto> getArticlesBySizeAndOffsetAndArticleName(Integer size, Integer offset, String articleName) {
        // TODO: validate size, offset and name of article
        return articleDao.getArticlesBySizeAndOffsetAndArticleName(size, offset, articleName);
    }

    @Override
    public Integer getNumberOfArticlesByCategoryId(Long categoryId) {
        // TODO: validate identifier of category
        return articleDao.getNumberOfArticlesByCategoryId(categoryId);
    }
}
