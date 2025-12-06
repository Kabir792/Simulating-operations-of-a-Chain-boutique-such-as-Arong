package com.example.arong;

public class TaxReport {
    private int fiscalYear;
    private double taxableAmount;
    private double estimatedTax;

    private boolean exportSuccessful;

    public TaxReport(int fiscalYear, double taxableAmount, double estimatedTax, boolean exportSuccessful) {
        this.fiscalYear = fiscalYear;
        this.taxableAmount = taxableAmount;
        this.estimatedTax = estimatedTax;
        this.exportSuccessful = exportSuccessful;
    }

    public int getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(int fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public double getTaxableAmount() {
        return taxableAmount;
    }

    public void setTaxableAmount(double taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    public double getEstimatedTax() {
        return estimatedTax;
    }

    public void setEstimatedTax(double estimatedTax) {
        this.estimatedTax = estimatedTax;
    }

    public boolean isExportSuccessful() {
        return exportSuccessful;
    }

    public void setExportSuccessful(boolean exportSuccessful) {
        this.exportSuccessful = exportSuccessful;
    }

    @Override
    public String toString() {
        return "TaxReport{" +
                "fiscalYear=" + fiscalYear +
                ", taxableAmount=" + taxableAmount +
                ", estimatedTax=" + estimatedTax +
                ", exportSuccessful=" + exportSuccessful +
                '}';
    }
}
