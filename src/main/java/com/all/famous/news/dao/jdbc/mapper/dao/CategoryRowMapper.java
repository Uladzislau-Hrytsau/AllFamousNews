package com.all.famous.news.dao.jdbc.mapper.dao;

import com.all.famous.news.model.dao.Category;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The type Category row mapper.
 */
@Component
public class CategoryRowMapper implements RowMapper<Category> {

    @Value("${category.categoryId}")
    private String categoryId;
    @Value("${category.categoryName}")
    private String category_name;
    @Value("${category.parentId}")
    private String parent_id;

    @Override
    public Category mapRow(ResultSet rs, int i) throws SQLException {
        Category category = new Category().builder()
                .categoryId(rs.getLong(categoryId))
                .categoryName(rs.getString(category_name))
                .parentId(rs.getLong(parent_id))
                .build();
        return category;
    }

}
