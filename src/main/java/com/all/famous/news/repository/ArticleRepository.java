package com.all.famous.news.repository;

import com.all.famous.news.model.entity.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {

    List<Article> findAll();

    Article findNewById(Long id);

}
