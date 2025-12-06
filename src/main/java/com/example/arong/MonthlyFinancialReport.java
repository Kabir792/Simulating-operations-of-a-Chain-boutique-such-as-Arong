package com.example.arong;

public class MonthlyFinancialReport {
    private int month;
    private int year;

    private double totalIncome;
    private double totalExpenses;
    private double profit;

    private boolean exportSuccessful;

    public MonthlyFinancialReport(int month, int year, double totalIncome, double totalExpenses, double profit, boolean exportSuccessful) {
        this.month = month;
        this.year = year;
        this.totalIncome = totalIncome;
        this.totalExpenses = totalExpenses;
        this.profit = profit;
        this.exportSuccessful = exportSuccessful;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public boolean isExportSuccessful() {
        return exportSuccessful;
    }

    public void setExportSuccessful(boolean exportSuccessful) {
        this.exportSuccessful = exportSuccessful;
    }

    @Override
    public String toString() {
        return "MonthlyFinancialReport{" +
                "month=" + month +
                ", year=" + year +
                ", totalIncome=" + totalIncome +
                ", totalExpenses=" + totalExpenses +
                ", profit=" + profit +
                ", exportSuccessful=" + exportSuccessful +
                '}';
    }
}
