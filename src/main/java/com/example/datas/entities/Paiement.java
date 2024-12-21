package com.example.datas.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paiement {
    private Date date;
    private double amount;
}
