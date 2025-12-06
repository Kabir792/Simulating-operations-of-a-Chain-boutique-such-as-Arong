package com.example.arong;

import java.time.LocalDateTime;

public class PrepareSalaries {
    private String staffId;
    private String staffName;
    private double basicSalary;
    private double allowance;
    private double deduction;
    private double netSalary;
    private boolean paid;
    private LocalDateTime paymentDateTime;
    private String paymentReference;

    public PrepareSalaries(String staffName, String staffId, double basicSalary, double allowance, double deduction, double netSalary, boolean paid, LocalDateTime paymentDateTime, String paymentReference) {
        this.staffName = staffName;
        this.staffId = staffId;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.deduction = deduction;
        this.netSalary = netSalary;
        this.paid = paid;
        this.paymentDateTime = paymentDateTime;
        this.paymentReference = paymentReference;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public LocalDateTime getPaymentDateTime() {
        return paymentDateTime;
    }

    public void setPaymentDateTime(LocalDateTime paymentDateTime) {
        this.paymentDateTime = paymentDateTime;
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }

    @Override
    public String toString() {
        return "PrepareSalaries{" +
                "staffId='" + staffId + '\'' +
                ", staffName='" + staffName + '\'' +
                ", basicSalary=" + basicSalary +
                ", allowance=" + allowance +
                ", deduction=" + deduction +
                ", netSalary=" + netSalary +
                ", paid=" + paid +
                ", paymentDateTime=" + paymentDateTime +
                ", paymentReference='" + paymentReference + '\'' +
                '}';
    }
}
