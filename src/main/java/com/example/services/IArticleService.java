package com.example.services;

import com.example.entities.Article;

import java.util.List;

public interface IArticleService {

    /**
     * Add a new article to the system.
     * 
     * @param article the article to add
     */
    void addArticle(Article article);

    /**
     * Retrieve a list of all articles.
     * 
     * @return a list of articles
     */
    List<Article> getAllArticles();

    /**
     * Find an article by its ID.
     * 
     * @param id the ID of the article
     * @return the article if found, or null if not
     */
    Article getArticleById(int id);

    /**
     * Update the details of an existing article.
     * 
     * @param article the updated article
     */
    void updateArticle(Article article);

    /**
     * Remove an article from the system by its ID.
     * 
     * @param id the ID of the article to remove
     */
    void deleteArticle(int id);
}
