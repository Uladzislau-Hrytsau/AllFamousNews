package com.all.famous.news.service;

import com.all.famous.news.model.dto.CategoryDto;

import java.util.List;

/**
 * The interface Category service.
 */
public interface CategoryService {

    /**
     * Gets categories.
     *
     * @return the categories
     */
    List<CategoryDto> getCategories();

}
