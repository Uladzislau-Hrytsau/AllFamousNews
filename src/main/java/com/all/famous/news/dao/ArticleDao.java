package com.all.famous.news.dao;

import com.all.famous.news.model.dto.ArticleDto;

import java.util.List;

/**
 * The interface Article dao.
 */
public interface ArticleDao {

    /**
     * Gets articles by size and offset.
     *
     * @param size   the size
     * @param offset the offset
     * @return the articles by size and offset
     */
    List<ArticleDto> getArticlesBySizeAndOffset(Integer size, Integer offset);

    /**
     * Gets articles by size and offset and category id.
     *
     * @param size       the size
     * @param offset     the offset
     * @param categoryId the category id
     * @return the articles by size and offset and category id
     */
    List<ArticleDto> getArticlesBySizeAndOffsetAndCategoryId(Integer size, Integer offset, Long categoryId);

    /**
     * Gets articles by size and offset and article name.
     *
     * @param size        the size
     * @param offset      the offset
     * @param articleName the article name
     * @return the articles by size and offset and article name
     */
    List<ArticleDto> getArticlesBySizeAndOffsetAndArticleName(Integer size, Integer offset, String articleName);

    /**
     * Gets number of articles by category id.
     *
     * @param categoryId the category id
     * @return the number of articles by category id
     */
    Integer getNumberOfArticlesByCategoryId(Long categoryId);

}
