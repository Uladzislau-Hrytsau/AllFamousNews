package com.all.famous.news.controller;

import com.all.famous.news.model.dao.Category;
import com.all.famous.news.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Category controller.
 */
@RestController
public class CategoryController {

    private final CategoryService categoryService;

    /**
     * Instantiates a new Category controller.
     *
     * @param categoryService the category service
     */
    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    /**
     * Gets all categories by parent id.
     *
     * @param parentId the parent id
     * @return the all categories by parent id
     */
    @GetMapping("/categories")
    @ResponseStatus(HttpStatus.OK)
    public List<Category> getAllCategoriesByParentId(@RequestParam(value = "parentId") Long parentId) {
        return categoryService.getCategoriesByParentId(parentId);
    }

}
