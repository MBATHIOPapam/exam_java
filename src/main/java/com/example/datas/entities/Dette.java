package com.example.datas.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Setter
@ToString
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dette {
    private Date date;
    private double amount;
    private double paidAmount;
    private double remainingAmount;
    private List<Article> articles;
}
