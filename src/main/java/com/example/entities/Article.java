package com.example.entities;

public class Article {
    private int id;
    private String name;
    private int stockQuantity;
    private double price;

    public Article(int id, String name, int stockQuantity, double price) {
        this.id = id;
        this.name = name;
        this.stockQuantity = stockQuantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stockQuantity=" + stockQuantity +
                ", price=" + price +
                '}';
            }
        }
        