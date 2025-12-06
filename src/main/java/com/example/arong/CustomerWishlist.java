package com.example.arong;

import java.time.LocalDate;

public class CustomerWishlist
{

    private String customerEmail;
    private String productName;
    private double price;

    private boolean available;
    private LocalDate dateAdded;

    public CustomerWishlist(String customerEmail, String productName, double price, boolean available, LocalDate dateAdded) {
        this.customerEmail = customerEmail;
        this.productName = productName;
        this.price = price;
        this.available = available;
        this.dateAdded = dateAdded;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "CustomerWishlist{" +
                "customerEmail='" + customerEmail + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", available=" + available +
                ", dateAdded=" + dateAdded +
                '}';
    }
}
