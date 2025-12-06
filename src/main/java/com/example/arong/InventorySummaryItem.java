package com.example.oop_final_project;

public class InventorySummaryItem {

private String productnameorcategoryname;
    private int quantity;
    private double stockValue;

    private String category;
    private double unitPrice;

    public InventorySummaryItem(int quantity, String productnameorcategoryname, String category, double stockValue, double unitPrice) {
        this.quantity = quantity;
        this.productnameorcategoryname = productnameorcategoryname;
        this.category = category;
        this.stockValue = stockValue;
        this.unitPrice = unitPrice;
    }

    public String getProductnameorcategoryname() {
        return productnameorcategoryname;
    }

    public void setProductnameorcategoryname(String productnameorcategoryname) {
        this.productnameorcategoryname = productnameorcategoryname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getStockValue() {
        return stockValue;
    }

    public void setStockValue(double stockValue) {
        this.stockValue = stockValue;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "InventorySummaryItem{" +
                "productnameorcategoryname='" + productnameorcategoryname + '\'' +
                ", quantity=" + quantity +
                ", stockValue=" + stockValue +
                ", category='" + category + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
