package com.all.famous.news.controller;

import com.all.famous.news.model.dto.CategoryDto;
import com.all.famous.news.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Category rest controller.
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoryRestController {

    private final CategoryService categoryService;

    /**
     * Instantiates a new Category rest controller.
     *
     * @param categoryService the category service
     */
    @Autowired
    public CategoryRestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    /**
     * Gets all categories.
     *
     * @return the all categories
     */
    @GetMapping("/categories")
    @ResponseStatus(HttpStatus.OK)
    public List<CategoryDto> getAllCategories() {
        return categoryService.getCategories();
    }

}
