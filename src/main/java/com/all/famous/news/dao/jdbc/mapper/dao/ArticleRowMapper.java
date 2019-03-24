package com.all.famous.news.dao.jdbc.mapper.dao;

import com.all.famous.news.model.dao.Article;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The type Article row mapper.
 */
@Component
@PropertySource("classpath:sql/sql-fields.properties")
public class ArticleRowMapper implements RowMapper<Article> {

    @Value("${article.articleId}")
    private String articleId;
    @Value("${article.articleName}")
    private String articleName;
    @Value("${article.articleDescription}")
    private String articleDescription;
    @Value("${article.articleContent}")
    private String articleContent;
    @Value("${article.encodeImage}")
    private String encodeImage;
    @Value("${article.categoryId}")
    private String categoryId;
    @Value("${article.articleDate}")
    private String articleDate;
    @Value("${article.articleAuthor}")
    private String articleAuthor;

    @Override
    public Article mapRow(ResultSet rs, int i) throws SQLException {
        return Article.builder()
                .id(rs.getLong(articleId))
                .articleName(rs.getString(articleName))
                .articleDescription(rs.getString(articleDescription))
                .articleContent(rs.getString(articleContent))
                .articleEncodeImg(rs.getString(encodeImage))
                .categoryId(rs.getLong(categoryId))
                .date(rs.getDate(articleDate) == null ? null : rs.getDate(articleDate).toLocalDate())
                .author(rs.getString(articleAuthor))
                .build();
    }

}
