package com.all.famous.news.dao;

import com.all.famous.news.model.dto.CategoryChildDto;
import com.all.famous.news.model.dto.CategoryDto;

import java.util.List;

/**
 * The interface Category dao.
 */
public interface CategoryDao {

    /**
     * Gets categories by parent id is null.
     *
     * @return the categories by parent id is null
     */
    List<CategoryDto> getCategoriesByParentIdIsNull();

    /**
     * Gets category children by parent id.
     *
     * @param parentId the parent id
     * @return the category children by parent id
     */
    List<CategoryChildDto> getCategoryChildrenByParentId(Long parentId);

}
