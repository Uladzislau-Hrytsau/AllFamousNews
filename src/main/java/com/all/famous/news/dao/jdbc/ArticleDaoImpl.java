package com.all.famous.news.dao.jdbc;

import com.all.famous.news.dao.ArticleDao;
import com.all.famous.news.dao.jdbc.mapper.dto.ArticleDtoRowMapper;
import com.all.famous.news.model.dto.ArticleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The type Article dao.
 */
@Component
@PropertySource("classpath:sql/sql-queries.properties")
@PropertySource("classpath:sql/sql-fields.properties")
public class ArticleDaoImpl implements ArticleDao {

    private static final String CATEGORY_ID = "categoryId";
    private static final String OFFSET = "offset";
    private static final String LIMIT = "limit";
    private static final String ARTICLE_NAME = "articleName";

    @Value("${article.selectArticlesBySizeAndOffset}")
    private String selectArticlesBySizeAndOffsetSql;
    @Value("${article.selectArticlesBySizeAndOffsetAndCategoryId}")
    private String selectArticlesBySizeAndOffsetAndCategoryIdSql;
    @Value("${article.selectNumberOfArticlesByCategoryId}")
    private String selectNumberOfArticlesByCategoryIdSql;
    @Value("${article.selectArticlesBySizeAndOffsetAndArticleName}")
    private String selectArticlesBySizeAndOffsetAndArticleNameSql;

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final ArticleDtoRowMapper articleDtoRowMapper;

    /**
     * Instantiates a new Article dao.
     *
     * @param namedParameterJdbcTemplate the named parameter jdbc template
     * @param articleDtoRowMapper        the article dto row mapper
     */
    @Autowired
    public ArticleDaoImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate,
                          ArticleDtoRowMapper articleDtoRowMapper) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        this.articleDtoRowMapper = articleDtoRowMapper;
    }

    @Override
    public List<ArticleDto> getArticlesBySizeAndOffset(Integer size, Integer offset) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        this.addOffsetAndLimit(parameterSource, offset, size);
        return namedParameterJdbcTemplate.query(selectArticlesBySizeAndOffsetSql, parameterSource, articleDtoRowMapper);
    }

    @Override
    public List<ArticleDto> getArticlesBySizeAndOffsetAndCategoryId(Integer size, Integer offset, Long categoryId) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue(CATEGORY_ID, categoryId);
        this.addOffsetAndLimit(parameterSource, offset, size);
        return namedParameterJdbcTemplate.query(selectArticlesBySizeAndOffsetAndCategoryIdSql, parameterSource, articleDtoRowMapper);
    }

    @Override
    public List<ArticleDto> getArticlesBySizeAndOffsetAndArticleName(Integer size, Integer offset, String articleName) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        this.addOffsetAndLimit(parameterSource, offset, size);
        parameterSource.addValue(ARTICLE_NAME, articleName);
        return namedParameterJdbcTemplate.query(selectArticlesBySizeAndOffsetAndArticleNameSql, parameterSource, articleDtoRowMapper);
    }

    @Override
    public Integer getNumberOfArticlesByCategoryId(Long categoryId) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue(CATEGORY_ID, categoryId);
        return namedParameterJdbcTemplate.queryForObject(selectNumberOfArticlesByCategoryIdSql, parameterSource, Integer.class);
    }

    private void addOffsetAndLimit(MapSqlParameterSource parameterSource, Integer offset, Integer limit) {
        parameterSource.addValue(OFFSET, offset);
        parameterSource.addValue(LIMIT, limit);
    }

}
