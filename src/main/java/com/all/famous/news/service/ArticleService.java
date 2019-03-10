package com.all.famous.news.service;

import com.all.famous.news.model.dto.ArticleDto;
import com.all.famous.news.model.entity.Article;

import java.util.List;

public interface ArticleService {

    List<Article> findAllArticle();

    List<ArticleDto> findAllArticleDto();

    void saveArticle(Article article);

}
