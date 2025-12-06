package com.example.oop_final_project;

public class saleSummaryRecord {
    private String period;


    private int totalOrders;


    private double totalRevenue;


    private double totalDiscount;


    private double netRevenue;

    public saleSummaryRecord(String period, double totalRevenue, int totalOrders, double totalDiscount, double netRevenue) {
        this.period = period;
        this.totalRevenue = totalRevenue;
        this.totalOrders = totalOrders;
        this.totalDiscount = totalDiscount;
        this.netRevenue = netRevenue;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public double getNetRevenue() {
        return netRevenue;
    }

    public void setNetRevenue(double netRevenue) {
        this.netRevenue = netRevenue;
    }

    @Override
    public String toString() {
        return "saleSummaryRecord{" +
                "period='" + period + '\'' +
                ", totalOrders=" + totalOrders +
                ", totalRevenue=" + totalRevenue +
                ", totalDiscount=" + totalDiscount +
                ", netRevenue=" + netRevenue +
                '}';
    }
}
