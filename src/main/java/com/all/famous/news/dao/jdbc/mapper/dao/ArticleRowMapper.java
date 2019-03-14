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
    @Value("${article.articleContent}")
    private String articleContent;
    @Value("${article.encodeImage}")
    private String encodeImage;
    @Value("${article.articleDescription}")
    private String articleDescription;
    @Value("${article.categoryId}")
    private String categoryId;

    @Override
    public Article mapRow(ResultSet rs, int i) throws SQLException {
        Article article = new Article().builder()
                .articleId(rs.getLong(articleId))
                .articleName(rs.getString(articleName))
                .articleContent(rs.getString(articleContent))
                .encodeImage(rs.getString(encodeImage))
                .articleDescription(rs.getString(articleDescription))
                .categoryId(rs.getLong(categoryId))
                .build();
        return article;
    }

}
