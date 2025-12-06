package com.example.oop_final_project;

import java.time.LocalDate;

public class Invoice {
    private Long invoiceId;
    private String invoiceNumber;

    private Long orderId;
    private String customerId;
    private String customerName;
    private LocalDate invoiceDate;



    private double subtotal;
    private double tax;
    private double grandTotal;

    private String notes;

    private String createdByUserId;

    public Invoice(Long invoiceId, String invoiceNumber, Long orderId, String customerId, String customerName, LocalDate invoiceDate, double subtotal, double grandTotal, double tax, String notes, String createdByUserId) {
        this.invoiceId = invoiceId;
        this.invoiceNumber = invoiceNumber;
        this.orderId = orderId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.invoiceDate = invoiceDate;
        this.subtotal = subtotal;
        this.grandTotal = grandTotal;
        this.tax = tax;
        this.notes = notes;
        this.createdByUserId = createdByUserId;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getCreatedByUserId() {
        return createdByUserId;
    }

    public void setCreatedByUserId(String createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", orderId=" + orderId +
                ", customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", invoiceDate=" + invoiceDate +
                ", subtotal=" + subtotal +
                ", tax=" + tax +
                ", grandTotal=" + grandTotal +
                ", notes='" + notes + '\'' +
                ", createdByUserId='" + createdByUserId + '\'' +
                '}';
    }
}
