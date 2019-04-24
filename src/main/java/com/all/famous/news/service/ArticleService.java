package com.all.famous.news.service;

import com.all.famous.news.model.Response;

/**
 * The interface Article service.
 */
public interface ArticleService {

    /**
     * Gets articles by size and offset.
     *
     * @param size the size
     * @param page the page
     * @return the articles by size and offset
     */
    Response getArticlesBySizeAndOffset(Integer size, Integer page);

    /**
     * Gets articles by size and offset and category id.
     *
     * @param size       the size
     * @param offset     the offset
     * @param categoryId the category id
     * @return the articles by size and offset and category id
     */
    Response getArticlesBySizeAndOffsetAndCategoryId(Integer size, Integer offset, Long categoryId);

    /**
     * Gets articles by size and offset and article name.
     *
     * @param size        the size
     * @param page        the page
     * @param articleName the article name
     * @return the articles by size and offset and article name
     */
    Response getArticlesBySizeAndOffsetAndArticleName(Integer size, Integer page, String articleName);

    /**
     * Gets count articles.
     *
     * @return the count articles
     */
    Long getCountArticles();

    /**
     * Gets count articles by category id.
     *
     * @param categoryId the category id
     * @return the count articles by category id
     */
    Long getCountArticlesByCategoryId(Long categoryId);

    /**
     * Gets count articles by title.
     *
     * @param title the title
     * @return the count articles by title
     */
    Long getCountArticlesByTitle(String title);

}
