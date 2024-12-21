package com.example.entities;

import java.time.LocalDate;

public class Paiement {
    private int id;
    private LocalDate date;
    private double amount;

    public Paiement(int id, LocalDate date, double amount) {
        this.id = id;
        this.date = date;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Paiement{" +
                "id=" + id +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}