package com.example.datas.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Data

@AllArgsConstructor
public class Article {
    public Article() {
    }
    private String name;
    private int stockQuantity;
    private double price;
}
