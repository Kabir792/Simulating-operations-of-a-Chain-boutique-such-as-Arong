package com.example.arong;

import java.time.LocalDate;

public class CustomerExchngReq
{
    private String customerEmail;

    private String orderId;
    private String reason;
    private LocalDate orderDate;
    private boolean eligible;
    private boolean submitted;

    public CustomerExchngReq(String customerEmail, String orderId, String reason, LocalDate orderDate, boolean eligible, boolean submitted) {
        this.customerEmail = customerEmail;
        this.orderId = orderId;
        this.reason = reason;
        this.orderDate = orderDate;
        this.eligible = eligible;
        this.submitted = submitted;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isEligible() {
        return eligible;
    }

    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public void setSubmitted(boolean submitted) {
        this.submitted = submitted;
    }

    @Override
    public String toString() {
        return "CustomerExchngReq{" +
                "customerEmail='" + customerEmail + '\'' +
                ", orderId='" + orderId + '\'' +
                ", reason='" + reason + '\'' +
                ", orderDate=" + orderDate +
                ", eligible=" + eligible +
                ", submitted=" + submitted +
                '}';
    }
}
