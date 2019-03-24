package com.all.famous.news.service.implementation;

import com.all.famous.news.dao.CategoryDao;
import com.all.famous.news.model.dto.CategoryDto;
import com.all.famous.news.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Category service.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryDao categoryDao;

    /**
     * Instantiates a new Category service.
     *
     * @param categoryDao the category dao
     */
    @Autowired
    public CategoryServiceImpl(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public List<CategoryDto> getCategories() {
        List<CategoryDto> categoryDtos = categoryDao.getCategoriesByParentIdIsNull();
        categoryDtos.forEach(
                item -> {
                    item.setChild(
                            categoryDao.getCategoryChildrenByParentId(item.getId())
                    );
                }
        );
        return categoryDtos;
    }
}
