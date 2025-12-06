package com.example.oop_final_project;

public class OrderrNotification

{
    private String orderId;
    private String customerName;
    private String orderStatus;
    private String orderDate;

    private String customerEmail;
    private String customerPhone;

    public OrderrNotification(String orderId, String customerPhone, String customerEmail, String orderDate, String orderStatus, String customerName) {
        this.orderId = orderId;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.customerName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Override
    public String toString() {
        return "OrderrNotification{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                '}';
    }
}
