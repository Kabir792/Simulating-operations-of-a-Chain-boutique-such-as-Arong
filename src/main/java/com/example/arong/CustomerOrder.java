package com.example.arong;

public class CustomerOrder {
    private String customerEmail;
    private String password;
    private String shippingAddress;
    private String phone;
    private String cardNumber;
    private String cvv;
    private String expiry;
    private double itemsTotal;
    private double taxAmount;
    private double discountAmount;
    private double finalAmount;
    private boolean stockVerified;
    private boolean confirmed;
    private String receiptNumber;

    public CustomerOrder(String password, String customerEmail, String shippingAddress, String phone, String cardNumber, String cvv, String expiry, double itemsTotal, double taxAmount, double discountAmount, boolean confirmed, boolean stockVerified, double finalAmount, String receiptNumber) {
        this.password = password;
        this.customerEmail = customerEmail;
        this.shippingAddress = shippingAddress;
        this.phone = phone;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiry = expiry;
        this.itemsTotal = itemsTotal;
        this.taxAmount = taxAmount;
        this.discountAmount = discountAmount;
        this.confirmed = confirmed;
        this.stockVerified = stockVerified;
        this.finalAmount = finalAmount;
        this.receiptNumber = receiptNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public double getItemsTotal() {
        return itemsTotal;
    }

    public void setItemsTotal(double itemsTotal) {
        this.itemsTotal = itemsTotal;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public boolean isStockVerified() {
        return stockVerified;
    }

    public void setStockVerified(boolean stockVerified) {
        this.stockVerified = stockVerified;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "customerEmail='" + customerEmail + '\'' +
                ", password='" + password + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", phone='" + phone + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expiry='" + expiry + '\'' +
                ", itemsTotal=" + itemsTotal +
                ", taxAmount=" + taxAmount +
                ", discountAmount=" + discountAmount +
                ", finalAmount=" + finalAmount +
                ", stockVerified=" + stockVerified +
                ", confirmed=" + confirmed +
                ", receiptNumber='" + receiptNumber + '\'' +
                '}';
    }
}
