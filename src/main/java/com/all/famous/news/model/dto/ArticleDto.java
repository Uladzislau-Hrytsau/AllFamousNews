package com.all.famous.news.model.dto;

import lombok.Builder;

import java.util.Objects;

/**
 * The type Article dto.
 */
@Builder
public class ArticleDto {

    private Long articleId;
    private String articleName;
    private String encodeImage;
    private String articleDescription;

    /**
     * Instantiates a new Article dto.
     */
    public ArticleDto() {
    }

    /**
     * Instantiates a new Article dto.
     *
     * @param articleId          the article id
     * @param articleName        the article name
     * @param encodeImage        the encode image
     * @param articleDescription the article description
     */
    public ArticleDto(Long articleId, String articleName, String encodeImage, String articleDescription) {
        this.articleId = articleId;
        this.articleName = articleName;
        this.encodeImage = encodeImage;
        this.articleDescription = articleDescription;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleDto that = (ArticleDto) o;
        return Objects.equals(articleId, that.articleId) &&
                Objects.equals(articleName, that.articleName) &&
                Objects.equals(encodeImage, that.encodeImage) &&
                Objects.equals(articleDescription, that.articleDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, articleName, encodeImage, articleDescription);
    }

    @Override
    public String toString() {
        return "ArticleDto{" +
                "articleId=" + articleId +
                ", articleName='" + articleName + '\'' +
                ", encodeImage='" + encodeImage + '\'' +
                ", articleDescription='" + articleDescription + '\'' +
                '}';
    }
}
