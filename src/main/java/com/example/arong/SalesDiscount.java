package com.example.oop_final_project;

public class SalesDiscount {

    private String promoCode;


    private double discountPercent;


    private double originalTotal;


    private double discountAmount;


    private double newTotal;


    private boolean valid;


    private String message;

    public SalesDiscount(String promoCode, double discountPercent, double originalTotal, double discountAmount, double newTotal, boolean valid, String message) {
        this.promoCode = promoCode;
        this.discountPercent = discountPercent;
        this.originalTotal = originalTotal;
        this.discountAmount = discountAmount;
        this.newTotal = newTotal;
        this.valid = valid;
        this.message = message;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double getOriginalTotal() {
        return originalTotal;
    }

    public void setOriginalTotal(double originalTotal) {
        this.originalTotal = originalTotal;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getNewTotal() {
        return newTotal;
    }

    public void setNewTotal(double newTotal) {
        this.newTotal = newTotal;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SalesDiscount{" +
                "promoCode='" + promoCode + '\'' +
                ", discountPercent=" + discountPercent +
                ", originalTotal=" + originalTotal +
                ", discountAmount=" + discountAmount +
                ", newTotal=" + newTotal +
                ", valid=" + valid +
                ", message='" + message + '\'' +
                '}';
    }
}
