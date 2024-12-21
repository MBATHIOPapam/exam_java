package com.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Dette {
    private int id;
    private double amount;
    private double amountPaid;
    private List<Article> articles;

    public Dette(int id, double amount, double amountPaid) {
        this.id = id;
        this.amount = amount;
        this.amountPaid = amountPaid;
        this.articles = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void addArticle(Article article) {
        this.articles.add(article);
    }

    @Override
    public String toString() {
        return "Dette{" +
        "id=" + id +
        ", amount=" + amount +
        ", amountPaid=" + amountPaid +
        ", articles=" + articles +
        '}';
}
}