package com.all.famous.news.dao.jdbc;

import com.all.famous.news.dao.ArticleDao;
import com.all.famous.news.dao.jdbc.mapper.dao.ArticleRowMapper;
import com.all.famous.news.model.dao.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The type Article dao.
 */
@Repository
@PropertySource("classpath:sql/sql-queries.properties")
@PropertySource("classpath:sql/sql-fields.properties")
public class ArticleDaoImpl implements ArticleDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final ArticleRowMapper articleRowMapper;
    @Value("${article.articleId}")
    private String ARTICLE_ID;
    @Value("${article.articleName}")
    private String ARTICLE_NAME;
    @Value("${article.articleDescription}")
    private String articleDescription;
    @Value("${article.articleContent}")
    private String articleContent;
    @Value("${article.encodeImage}")
    private String encodeImage;
    @Value("${article.categoryId}")
    private String CATEGORY_ID;
    @Value("${article.articleDate}")
    private String articleDate;
    @Value("${article.articleAuthor}")
    private String articleAuthor;
    @Value("${pagination.offset}")
    private String OFFSET;
    @Value("${pagination.limit}")
    private String LIMIT;
    @Value("${article.selectArticlesBySizeAndOffset}")
    private String selectArticlesBySizeAndOffsetSql;
    @Value("${article.selectArticlesBySizeAndOffsetAndCategoryId}")
    private String selectArticlesBySizeAndOffsetAndCategoryIdSql;
    @Value("${article.selectNumberOfArticlesByCategoryId}")
    private String selectNumberOfArticlesByCategoryIdSql;
    @Value("${article.selectArticlesBySizeAndOffsetAndArticleName}")
    private String selectArticlesBySizeAndOffsetAndArticleNameSql;
    @Value("${article.selectNumberOfArticles}")
    private String selectNumberOfArticlesSql;
    @Value("${article.selectNumberOfArticlesByTitle}")
    private String selectNumberOfArticlesByTitleSql;

    /**
     * Instantiates a new Article dao.
     *
     * @param namedParameterJdbcTemplate the named parameter jdbc template
     * @param articleDtoRowMapper        the article dto row mapper
     */
    @Autowired
    public ArticleDaoImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate,
                          ArticleRowMapper articleDtoRowMapper) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        this.articleRowMapper = articleDtoRowMapper;
    }

    @Override
    public List<Article> getArticlesBySizeAndOffset(Integer size, Integer offset) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        this.addOffsetAndLimit(parameterSource, offset, size);
        return namedParameterJdbcTemplate.query(selectArticlesBySizeAndOffsetSql, parameterSource, articleRowMapper);
    }

    @Override
    public List<Article> getArticlesBySizeAndOffsetAndCategoryId(Integer size, Integer offset, Long categoryId) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue(CATEGORY_ID, categoryId);
        this.addOffsetAndLimit(parameterSource, offset, size);
        return namedParameterJdbcTemplate.query(selectArticlesBySizeAndOffsetAndCategoryIdSql, parameterSource, articleRowMapper);
    }

    @Override
    public List<Article> getArticlesBySizeAndOffsetAndArticleName(Integer size, Integer offset, String articleName) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        this.addOffsetAndLimit(parameterSource, offset, size);
        parameterSource.addValue(ARTICLE_NAME, articleName);
        return namedParameterJdbcTemplate.query(selectArticlesBySizeAndOffsetAndArticleNameSql, parameterSource, articleRowMapper);
    }

    @Override
    public Long getCountArticles() {
        return namedParameterJdbcTemplate.getJdbcTemplate().queryForObject(selectNumberOfArticlesSql, Long.class);
    }

    @Override
    public Long getCountArticlesByCategoryId(Long categoryId) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue(CATEGORY_ID, categoryId);
        return namedParameterJdbcTemplate.queryForObject(selectNumberOfArticlesByCategoryIdSql, parameterSource, Long.class);
    }

    @Override
    public Long getCountArticlesByTitle(String title) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue(ARTICLE_NAME, title);
        return namedParameterJdbcTemplate.queryForObject(selectNumberOfArticlesByTitleSql, parameterSource, Long.class);
    }

    private void addOffsetAndLimit(MapSqlParameterSource parameterSource, Integer offset, Integer limit) {
        parameterSource.addValue(OFFSET, offset);
        parameterSource.addValue(LIMIT, limit);
    }

}
