package com.all.famous.news.dao;

import com.all.famous.news.model.dao.Category;

import java.util.List;

/**
 * The interface Category dao.
 */
public interface CategoryDao {

    /**
     * Gets categories by parent id.
     *
     * @param parentId the parent id
     * @return the categories by parent id
     */
    List<Category> getCategoriesByParentId(Long parentId);

}
