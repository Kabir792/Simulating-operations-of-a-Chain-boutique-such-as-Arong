package com.example.arong;

import java.time.LocalDate;

public class ManageExpense {
    private String category;
    private double amount;
    private LocalDate date;

    public ManageExpense(String category, double amount, LocalDate date) {
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ManageExpense{" +
                "category='" + category + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
