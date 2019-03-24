package com.all.famous.news.dao.jdbc.mapper.dto;

import com.all.famous.news.model.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The type Category dto row mapper.
 */
@Component
@PropertySource("classpath:sql/sql-fields.properties")
public class CategoryDtoRowMapper implements RowMapper<CategoryDto> {

    @Value("${category.categoryId}")
    private String categoryId;
    @Value("${category.categoryName}")
    private String category_name;

    @Override
    public CategoryDto mapRow(ResultSet rs, int i) throws SQLException {
//        this.icon = "fa fa-user";
        return new CategoryDto().builder()
                .id(rs.getLong(categoryId))
                .title(rs.getString(category_name))
                .icon("fa fa-user")
                .build();
    }

}
