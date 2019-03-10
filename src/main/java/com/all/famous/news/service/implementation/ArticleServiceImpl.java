package com.all.famous.news.service.implementation;

import com.all.famous.news.model.dto.ArticleDto;
import com.all.famous.news.model.entity.Article;
import com.all.famous.news.repository.ArticleRepository;
import com.all.famous.news.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> findAllArticle() {
        return articleRepository.findAll();
    }

    @Override
    public List<ArticleDto> findAllArticleDto() {
        List<Article> article = articleRepository.findAll();
        List<ArticleDto> articles = new ArrayList<>(article.size());
        article.forEach(item -> {
            articles.add(
                    new ArticleDto().builder()
                            .id(item.getId())
                            .title(item.getTitle())
                            .description(item.getDescription())
                            .build()
            );
        });
        return articles;
    }

    @Override
    public void saveArticle(Article article) {
        articleRepository.save(article);
    }

}
