package com.all.famous.news.dao.jdbc;

import com.all.famous.news.dao.CategoryDao;
import com.all.famous.news.dao.jdbc.mapper.dao.CategoryRowMapper;
import com.all.famous.news.model.dao.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The type Category dao.
 */
@Component
public class CategoryDaoImpl implements CategoryDao {

    private static final String PARENT_ID = "parentId";

    @Value("${category.selectArticlesByCategoryId}")
    private String selectArticlesByCategoryIdSql;

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final CategoryRowMapper categoryRowMapper;

    /**
     * Instantiates a new Category dao.
     *
     * @param namedParameterJdbcTemplate the named parameter jdbc template
     * @param categoryRowMapper          the category row mapper
     */
    @Autowired
    public CategoryDaoImpl(
            NamedParameterJdbcTemplate namedParameterJdbcTemplate,
            CategoryRowMapper categoryRowMapper) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        this.categoryRowMapper = categoryRowMapper;
    }

    @Override
    public List<Category> getCategoriesByParentId(Long parentId) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue(PARENT_ID, parentId);
        return namedParameterJdbcTemplate.query(selectArticlesByCategoryIdSql, parameterSource, categoryRowMapper);
    }
}
