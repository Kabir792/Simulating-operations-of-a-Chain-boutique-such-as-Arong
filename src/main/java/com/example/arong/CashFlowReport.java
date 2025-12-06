package com.example.arong;

import java.time.LocalDate;

public class CashFlowReport {
    private String month;
    private LocalDate fromDate;
    private LocalDate toDate;
    private double amount;
    private String note;
    private double totalInflow;
    private double totalOutflow;
    private double netCashFlow;

    private boolean isRangeUsed;

    public CashFlowReport(String month, LocalDate fromDate, LocalDate toDate, double totalInflow, double totalOutflow, double netCashFlow, boolean isRangeUsed) {
        this.month = month;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.totalInflow = totalInflow;
        this.totalOutflow = totalOutflow;
        this.netCashFlow = netCashFlow;
        this.isRangeUsed = isRangeUsed;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public double getTotalInflow() {
        return totalInflow;
    }

    public void setTotalInflow(double totalInflow) {
        this.totalInflow = totalInflow;
    }

    public double getTotalOutflow() {
        return totalOutflow;
    }

    public void setTotalOutflow(double totalOutflow) {
        this.totalOutflow = totalOutflow;
    }

    public double getNetCashFlow() {
        return netCashFlow;
    }

    public void setNetCashFlow(double netCashFlow) {
        this.netCashFlow = netCashFlow;
    }

    public boolean isRangeUsed() {
        return isRangeUsed;
    }

    public void setRangeUsed(boolean rangeUsed) {
        isRangeUsed = rangeUsed;
    }

    @Override
    public String toString() {
        return "CashFlowReport{" +
                "month='" + month + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", totalInflow=" + totalInflow +
                ", totalOutflow=" + totalOutflow +
                ", netCashFlow=" + netCashFlow +
                ", isRangeUsed=" + isRangeUsed +
                '}';
    }
}
