package com.example.oop_final_project;

public class PriceUpdate {
    private Long productId;
    private String productName;

    private double oldPrice;
    private double newPrice;

    public PriceUpdate(Long productId, String productName, double oldPrice, double newPrice) {
        this.productId = productId;
        this.productName = productName;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }

    @Override
    public String toString() {
        return "PriceUpdate{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", oldPrice=" + oldPrice +
                ", newPrice=" + newPrice +
                '}';
    }
}
