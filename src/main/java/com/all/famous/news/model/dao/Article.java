package com.all.famous.news.model.dao;

import lombok.Builder;

import java.io.Serializable;
import java.util.Objects;

/**
 * The type Article.
 */
@Builder
public class Article implements Serializable {

    private Long articleId;
    private String articleName;
    private String articleContent;
    private String encodeImage;
    private String articleDescription;
    private Long categoryId;

    /**
     * Instantiates a new Article.
     */
    public Article() {
    }

    /**
     * Instantiates a new Article.
     *
     * @param articleId          the article id
     * @param articleName        the article name
     * @param articleContent     the article content
     * @param encodeImage        the encode image
     * @param articleDescription the article description
     * @param categoryId         the category id
     */
    public Article(Long articleId, String articleName, String articleContent, String encodeImage, String articleDescription, Long categoryId) {
        this.articleId = articleId;
        this.articleName = articleName;
        this.articleContent = articleContent;
        this.encodeImage = encodeImage;
        this.articleDescription = articleDescription;
        this.categoryId = categoryId;
    }

    /**
     * Gets article id.
     *
     * @return the article id
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * Sets article id.
     *
     * @param articleId the article id
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * Gets article name.
     *
     * @return the article name
     */
    public String getArticleName() {
        return articleName;
    }

    /**
     * Sets article name.
     *
     * @param articleName the article name
     */
    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    /**
     * Gets article content.
     *
     * @return the article content
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * Sets article content.
     *
     * @param articleContent the article content
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    /**
     * Gets encode image.
     *
     * @return the encode image
     */
    public String getEncodeImage() {
        return encodeImage;
    }

    /**
     * Sets encode image.
     *
     * @param encodeImage the encode image
     */
    public void setEncodeImage(String encodeImage) {
        this.encodeImage = encodeImage;
    }

    /**
     * Gets article description.
     *
     * @return the article description
     */
    public String getArticleDescription() {
        return articleDescription;
    }

    /**
     * Sets article description.
     *
     * @param articleDescription the article description
     */
    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription;
    }

    /**
     * Gets category id.
     *
     * @return the category id
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * Sets category id.
     *
     * @param categoryId the category id
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(articleId, article.articleId) &&
                Objects.equals(articleName, article.articleName) &&
                Objects.equals(articleContent, article.articleContent) &&
                Objects.equals(encodeImage, article.encodeImage) &&
                Objects.equals(articleDescription, article.articleDescription) &&
                Objects.equals(categoryId, article.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, articleName, articleContent, encodeImage, articleDescription, categoryId);
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", articleName='" + articleName + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", encodeImage='" + encodeImage + '\'' +
                ", articleDescription='" + articleDescription + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}
