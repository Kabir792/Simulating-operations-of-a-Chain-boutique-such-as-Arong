package com.example.oop_final_project;

public class LowStockProduct {
    private Long productId;
    private String productName;
    private int quantity;
    private String supplierName;
    private boolean reorderRequested;

    public LowStockProduct(Long productId, String productName, int quantity, String supplierName, boolean reorderRequested) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.supplierName = supplierName;
        this.reorderRequested = reorderRequested;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public boolean isReorderRequested() {
        return reorderRequested;
    }

    public void setReorderRequested(boolean reorderRequested) {
        this.reorderRequested = reorderRequested;
    }

    @Override
    public String toString() {
        return "LowStockProduct{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", supplierName='" + supplierName + '\'' +
                ", reorderRequested=" + reorderRequested +
                '}';
    }
}
