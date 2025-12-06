package com.example.arong;

import java.time.LocalDate;

public class PendingPayment {
    private String invoiceId;
    private String supplierName;
    private double amount;
    private LocalDate dueDate;
    private boolean isCleared;

    public PendingPayment(String invoiceId, String supplierName, double amount, LocalDate dueDate, boolean isCleared) {
        this.invoiceId = invoiceId;
        this.supplierName = supplierName;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isCleared = isCleared;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCleared() {
        return isCleared;
    }

    public void setCleared(boolean cleared) {
        isCleared = cleared;
    }

    @Override
    public String toString() {
        return "PendingPayment{" +
                "invoiceId='" + invoiceId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", amount=" + amount +
                ", dueDate=" + dueDate +
                ", isCleared=" + isCleared +
                '}';
    }
}
