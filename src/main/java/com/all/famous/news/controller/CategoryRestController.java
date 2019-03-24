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

//    /**
//     * Gets all categories by parent id.
//     *
//     * @param parentId the parent id
//     * @return the all categories by parent id
//     */
//    @GetMapping("/categoriess")
//    @ResponseStatus(HttpStatus.OK)
//    public List<Category> getAllCategoriesByParentId(@RequestParam(value = "parentId") Long parentId) {
//        return categoryService.getCategoriesByParentId(parentId);
//    }

    /**
     * Gets all categories.
     *
     * @return the all categories
     */
    @GetMapping("/categories")
    @ResponseStatus(HttpStatus.OK)
    public List<CategoryDto> getAllCategories() {
//        List<CategoryDto> list = new ArrayList<>();
//        CategoryDto categoryDto = new CategoryDto();
//        categoryDto.setId(1L);
//        categoryDto.setTitle("sport");
//        CategoryChildDto categoryChildDto1 = new CategoryChildDto();
//        categoryChildDto1.setId(2L);
//        categoryChildDto1.setTitle("below sport 1");
//        CategoryChildDto categoryChildDto2 = new CategoryChildDto();
//        categoryChildDto2.setId(3L);
//        categoryChildDto2.setTitle("below sport 2");
//        List<CategoryChildDto> categoryChildDtos = new ArrayList<>();
//        categoryChildDtos.add(categoryChildDto1);
//        categoryChildDtos.add(categoryChildDto2);
//        categoryDto.setChild(categoryChildDtos);
//        list.add(categoryDto);
//        return list;
        return categoryService.getCategories();
    }

}
