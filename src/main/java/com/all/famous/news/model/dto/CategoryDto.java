package com.all.famous.news.model.dto;

import lombok.Builder;

import java.util.List;
import java.util.Objects;

/**
 * The type Category dto.
 */
@Builder
public class CategoryDto {

    private Long id;
    private String title;
    private String icon;
    private List<CategoryChildDto> child;

    /**
     * Instantiates a new Category dto.
     */
    public CategoryDto() {
    }

    /**
     * Instantiates a new Category dto.
     *
     * @param id    the id
     * @param title the title
     * @param icon  the icon
     * @param child the child
     */
    public CategoryDto(Long id, String title, String icon, List<CategoryChildDto> child) {
        this.id = id;
        this.title = title;
        this.icon = icon;
        this.child = child;
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

    /**
     * Gets child.
     *
     * @return the child
     */
    public List<CategoryChildDto> getChild() {
        return child;
    }

    /**
     * Sets child.
     *
     * @param child the child
     */
    public void setChild(List<CategoryChildDto> child) {
        this.child = child;
    }

    /**
     * Gets icon.
     *
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets icon.
     *
     * @param icon the icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryDto that = (CategoryDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(icon, that.icon) &&
                Objects.equals(child, that.child);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, icon, child);
    }

    @Override
    public String toString() {
        return "CategoryDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", child=" + child +
                '}';
    }
}
