package com.example.arong;

public class RevenueRecord {
    private String period;
    private double totalRevenue;
    private boolean confirmed;

    public RevenueRecord(String period, double totalRevenue, boolean confirmed) {
        this.period = period;
        this.totalRevenue = totalRevenue;
        this.confirmed = confirmed;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    @Override
    public String toString() {
        return "RevenueRecord{" +
                "period='" + period + '\'' +
                ", totalRevenue=" + totalRevenue +
                ", confirmed=" + confirmed +
                '}';
    }
}
