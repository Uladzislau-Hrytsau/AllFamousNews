package com.all.famous.news.dao;

import com.all.famous.news.model.dao.Article;

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
    List<Article> getArticlesBySizeAndOffset(Integer size, Integer offset);

    /**
     * Gets articles by size and offset and category id.
     *
     * @param size       the size
     * @param offset     the offset
     * @param categoryId the category id
     * @return the articles by size and offset and category id
     */
    List<Article> getArticlesBySizeAndOffsetAndCategoryId(Integer size, Integer offset, Long categoryId);

    /**
     * Gets articles by size and offset and article name.
     *
     * @param size        the size
     * @param offset      the offset
     * @param articleName the article name
     * @return the articles by size and offset and article name
     */
    List<Article> getArticlesBySizeAndOffsetAndArticleName(Integer size, Integer offset, String articleName);

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
