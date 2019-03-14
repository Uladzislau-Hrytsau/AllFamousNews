package com.all.famous.news.dao.jdbc.mapper.dto;

import com.all.famous.news.model.dto.ArticleDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The type Article dto row mapper.
 */
@Component
@PropertySource("classpath:sql/sql-fields.properties")
public class ArticleDtoRowMapper implements RowMapper<ArticleDto> {

    @Value("${article.articleId}")
    private String articleId;
    @Value("${article.articleName}")
    private String articleName;
    @Value("${article.encodeImage}")
    private String encodeImage;
    @Value("${article.articleDescription}")
    private String articleDescription;

    @Override
    public ArticleDto mapRow(ResultSet rs, int i) throws SQLException {
        ArticleDto article = new ArticleDto().builder()
                .articleId(rs.getLong(articleId))
                .articleName(rs.getString(articleName))
                .encodeImage(rs.getString(encodeImage))
                .articleDescription(rs.getString(articleDescription))
                .build();
        return article;
    }

}
