package com.all.famous.news.model.dto;

import lombok.Builder;

import java.util.Objects;

/**
 * The type Category child dto.
 */
@Builder
public class CategoryChildDto {

    private Long id;
    private String title;

    /**
     * Instantiates a new Category child dto.
     */
    public CategoryChildDto() {
    }

    /**
     * Instantiates a new Category child dto.
     *
     * @param id    the id
     * @param title the title
     */
    public CategoryChildDto(Long id, String title) {
        this.id = id;
        this.title = title;
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
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryChildDto that = (CategoryChildDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public String toString() {
        return "CategoryChildDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
