package com.example.oop_final_project;

public class ReturnRefundRequest {
    private String orderId;
    private String reason;

    private boolean eligible;
    private double orderAmount;
    private double refundAmount;

    private String orderStatus;

    public String getOrderId() {
        return orderId;
    }

    public boolean isEligible() {
        return eligible;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public String getReason() {
        return reason;
    }

    public double getRefundAmount() {
        return refundAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }

    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "ReturnRefundRequest{" +
                "orderId='" + orderId + '\'' +
                ", reason='" + reason + '\'' +
                ", eligible=" + eligible +
                ", orderAmount=" + orderAmount +
                ", refundAmount=" + refundAmount +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
