package com.example.arong;

import java.time.LocalDate;

public class DailySalesRecord {
    private LocalDate date;
    private double cashSales;
    private double cardSales;
    private double onlineSales;
    private double totalSales;

    public DailySalesRecord(LocalDate date, double cashSales, double cardSales, double onlineSales, double totalSales) {
        this.date = date;
        this.cashSales = cashSales;
        this.cardSales = cardSales;
        this.onlineSales = onlineSales;
        this.totalSales = totalSales;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getCashSales() {
        return cashSales;
    }

    public void setCashSales(double cashSales) {
        this.cashSales = cashSales;
    }

    public double getCardSales() {
        return cardSales;
    }

    public void setCardSales(double cardSales) {
        this.cardSales = cardSales;
    }

    public double getOnlineSales() {
        return onlineSales;
    }

    public void setOnlineSales(double onlineSales) {
        this.onlineSales = onlineSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return "DailySalesRecord{" +
                "date=" + date +
                ", cashSales=" + cashSales +
                ", cardSales=" + cardSales +
                ", onlineSales=" + onlineSales +
                ", totalSales=" + totalSales +
                '}';
    }
}
