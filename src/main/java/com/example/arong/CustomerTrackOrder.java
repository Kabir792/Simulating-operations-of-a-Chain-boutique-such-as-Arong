package com.example.arong;

import java.time.LocalDate;

public class CustomerTrackOrder {
    private String orderId;
    private LocalDate orderDate;
    private double totalAmount;
    private String status;
    private LocalDate estimatedDeliveryDate;
    private String itemsDescription;

    public CustomerTrackOrder(String orderId, LocalDate orderDate, double totalAmount, String status, LocalDate estimatedDeliveryDate, String itemsDescription) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
        this.estimatedDeliveryDate = estimatedDeliveryDate;
        this.itemsDescription = itemsDescription;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public String getItemsDescription() {
        return itemsDescription;
    }

    public void setItemsDescription(String itemsDescription) {
        this.itemsDescription = itemsDescription;
    }

    @Override
    public String toString() {
        return "CustomerTrackOrder{" +
                "orderId='" + orderId + '\'' +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                ", estimatedDeliveryDate=" + estimatedDeliveryDate +
                ", itemsDescription='" + itemsDescription + '\'' +
                '}';
    }
}
