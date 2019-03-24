package com.all.famous.news.dao.jdbc;

import com.all.famous.news.dao.CategoryDao;
import com.all.famous.news.dao.jdbc.mapper.dto.CategoryChildDtoRowMapper;
import com.all.famous.news.dao.jdbc.mapper.dto.CategoryDtoRowMapper;
import com.all.famous.news.model.dto.CategoryChildDto;
import com.all.famous.news.model.dto.CategoryDto;
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

    private static final String PARENT_ID = "parent_id";

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final CategoryDtoRowMapper categoryDtoRowMapper;
    private final CategoryChildDtoRowMapper categoryChildDtoRowMapper;

    @Value("${category.selectCategoryChildrenByParentId}")
    private String selectCategoryChildrenByParentIdSql;
    @Value("${category.selectCategoryByParentIdIsNull}")
    private String selectCategoryByParentIdIsNullSql;

    /**
     * Instantiates a new Category dao.
     *
     * @param namedParameterJdbcTemplate the named parameter jdbc template
     * @param categoryDtoRowMapper       the category dto row mapper
     * @param categoryChildDtoRowMapper  the category child dto row mapper
     */
    @Autowired
    public CategoryDaoImpl(
            NamedParameterJdbcTemplate namedParameterJdbcTemplate,
            CategoryDtoRowMapper categoryDtoRowMapper,
            CategoryChildDtoRowMapper categoryChildDtoRowMapper) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        this.categoryDtoRowMapper = categoryDtoRowMapper;
        this.categoryChildDtoRowMapper = categoryChildDtoRowMapper;
    }


    @Override
    public List<CategoryDto> getCategoriesByParentIdIsNull() {
        return namedParameterJdbcTemplate.query(selectCategoryByParentIdIsNullSql, categoryDtoRowMapper);
    }

    @Override
    public List<CategoryChildDto> getCategoryChildrenByParentId(Long parentId) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue(PARENT_ID, parentId);
        return namedParameterJdbcTemplate.query(selectCategoryChildrenByParentIdSql, parameterSource, categoryChildDtoRowMapper);
    }
}
