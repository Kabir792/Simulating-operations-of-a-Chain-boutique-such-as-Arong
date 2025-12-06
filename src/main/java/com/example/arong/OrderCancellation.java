package com.example.oop_final_project;

public class OrderCancellation {

    private String orderId;
    private String customerName;
    private String status;
    private String orderDate;
    private boolean eligibleForCancel;

    public OrderCancellation(String orderId, boolean eligibleForCancel, String orderDate, String status, String customerName) {
        this.orderId = orderId;
        this.eligibleForCancel = eligibleForCancel;
        this.orderDate = orderDate;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isEligibleForCancel() {
        return eligibleForCancel;
    }

    public void setEligibleForCancel(boolean eligibleForCancel) {
        this.eligibleForCancel = eligibleForCancel;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "OrderCancellation{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", status='" + status + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", eligibleForCancel=" + eligibleForCancel +
                '}';
    }
}
