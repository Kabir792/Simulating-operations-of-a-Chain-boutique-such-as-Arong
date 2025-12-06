package com.example.oop_final_project;

public class StockUpdate {

    private Long productId;
    private String productName;

    private int oldQuantity;
    private int newQuantity;

    public StockUpdate(Long productId, String productName, int oldQuantity, int newQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.oldQuantity = oldQuantity;
        this.newQuantity = newQuantity;
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

    public int getOldQuantity() {
        return oldQuantity;
    }

    public void setOldQuantity(int oldQuantity) {
        this.oldQuantity = oldQuantity;
    }

    public int getNewQuantity() {
        return newQuantity;
    }

    public void setNewQuantity(int newQuantity) {
        this.newQuantity = newQuantity;
    }

    @Override
    public String toString() {
        return "StockUpdate{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", oldQuantity=" + oldQuantity +
                ", newQuantity=" + newQuantity +
                '}';
    }
}
