package com.example.views.impl;

import com.example.entities.Article;
import com.example.services.IArticleService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArticleView {
    private final IArticleService articleService;
    private final Scanner scanner;

    public ArticleView(IArticleService articleService) {
        this.articleService = articleService;
        this.scanner = new Scanner(System.in);
    }

    public void addArticleView() {
        try {
            System.out.println("Enter article name:");
            String name = scanner.nextLine();

            System.out.println("Enter stock quantity:");
            int stockQuantity = scanner.nextInt();

            System.out.println("Enter price:");
            double price = scanner.nextDouble();

            Article article = new Article(0, name, stockQuantity, price);
            articleService.addArticle(article);
            System.out.println("Article added successfully.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter the correct data type.");
            scanner.nextLine(); // clear buffer
        }
    }

    public void displayAllArticles() {
        articleService.getAllArticles().forEach(System.out::println);
    }
}
