package com.example.arong;

import java.time.LocalDateTime;

public class CustomerFeedback {
    private Long id;
    private String customerEmail;
    private String productName;

    private int rating;
    private String reviewText;

    private LocalDateTime createdAt;

    public CustomerFeedback(Long id, String customerEmail, String productName, int rating, String reviewText, LocalDateTime createdAt) {
        this.id = id;
        this.customerEmail = customerEmail;
        this.productName = productName;
        this.rating = rating;
        this.reviewText = reviewText;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "CustomerFeedback{" +
                "id=" + id +
                ", customerEmail='" + customerEmail + '\'' +
                ", productName='" + productName + '\'' +
                ", rating=" + rating +
                ", reviewText='" + reviewText + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
