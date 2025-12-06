package com.example.oop_final_project;

public class salesOrder {
    private Long orderId;
    private String customerId;



    private double subtotal;
    private double discount;
    private double total;

    private String status;
    private String createdByUserId;

    public salesOrder(Long orderId, String customerId, double subtotal, double total, double discount, String status, String createdByUserId) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.subtotal = subtotal;
        this.total = total;
        this.discount = discount;
        this.status = status;
        this.createdByUserId = createdByUserId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedByUserId() {
        return createdByUserId;
    }

    public void setCreatedByUserId(String createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    @Override
    public String toString() {
        return "salesOrder{" +
                "orderId=" + orderId +
                ", customerId='" + customerId + '\'' +
                ", subtotal=" + subtotal +
                ", discount=" + discount +
                ", total=" + total +
                ", status='" + status + '\'' +
                ", createdByUserId='" + createdByUserId + '\'' +
                '}';
    }
}
