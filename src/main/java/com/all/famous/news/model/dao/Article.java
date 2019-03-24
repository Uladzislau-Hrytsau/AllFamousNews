package com.all.famous.news.model.dao;

import lombok.Builder;

import java.time.LocalDate;
import java.util.Objects;

/**
 * The type Article.
 */
@Builder
public class Article {

    private Long id;
    private String articleName;
    private String articleDescription;
    private String articleContent;
    private String articleEncodeImg;
    private Long categoryId;
    private LocalDate date;
    private String author;

    /**
     * Instantiates a new Article.
     */
    public Article() {
    }

    /**
     * Instantiates a new Article.
     *
     * @param id                 the id
     * @param articleName        the article name
     * @param articleDescription the article description
     * @param articleContent     the article content
     * @param articleEncodeImg   the article encode img
     * @param categoryId         the category id
     * @param date               the date
     * @param author             the author
     */
    public Article(Long id, String articleName, String articleDescription, String articleContent, String articleEncodeImg, Long categoryId, LocalDate date, String author) {
        this.id = id;
        this.articleName = articleName;
        this.articleDescription = articleDescription;
        this.articleContent = articleContent;
        this.articleEncodeImg = articleEncodeImg;
        this.categoryId = categoryId;
        this.date = date;
        this.author = author;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
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
     * Gets article encode img.
     *
     * @return the article encode img
     */
    public String getArticleEncodeImg() {
        return articleEncodeImg;
    }

    /**
     * Sets article encode img.
     *
     * @param articleEncodeImg the article encode img
     */
    public void setArticleEncodeImg(String articleEncodeImg) {
        this.articleEncodeImg = articleEncodeImg;
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

    /**
     * Gets date.
     *
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Gets author.
     *
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets author.
     *
     * @param author the author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article that = (Article) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(articleName, that.articleName) &&
                Objects.equals(articleDescription, that.articleDescription) &&
                Objects.equals(articleContent, that.articleContent) &&
                Objects.equals(articleEncodeImg, that.articleEncodeImg) &&
                Objects.equals(categoryId, that.categoryId) &&
                Objects.equals(date, that.date) &&
                Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, articleName, articleDescription, articleContent, articleEncodeImg, categoryId, date, author);
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", articleName='" + articleName + '\'' +
                ", articleDescription='" + articleDescription + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", articleEncodeImg='" + articleEncodeImg + '\'' +
                ", categoryId=" + categoryId +
                ", date=" + date +
                ", author='" + author + '\'' +
                '}';
    }
}
