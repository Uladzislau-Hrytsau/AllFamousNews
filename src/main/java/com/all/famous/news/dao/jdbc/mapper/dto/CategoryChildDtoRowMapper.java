package com.all.famous.news.dao.jdbc.mapper.dto;

import com.all.famous.news.model.dto.CategoryChildDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The type Category child dto row mapper.
 */
@Component
@PropertySource("classpath:sql/sql-fields.properties")
public class CategoryChildDtoRowMapper implements RowMapper<CategoryChildDto> {

    @Value("${category.categoryId}")
    private String categoryId;
    @Value("${category.categoryName}")
    private String category_name;

    @Override
    public CategoryChildDto mapRow(ResultSet rs, int i) throws SQLException {
        return new CategoryChildDto().builder()
                .id(rs.getLong(categoryId))
                .title(rs.getString(category_name))
                .build();
    }

}
