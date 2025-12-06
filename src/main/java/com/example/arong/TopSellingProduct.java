package com.example.oop_final_project;

public class TopSellingProduct {
    private String productName;
    private int salesCount;
    private int rank;

    public TopSellingProduct(String productName, int salesCount, int rank) {
        this.productName = productName;
        this.salesCount = salesCount;
        this.rank = rank;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(int salesCount) {
        this.salesCount = salesCount;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "TopSellingProduct{" +
                "productName='" + productName + '\'' +
                ", salesCount=" + salesCount +
                ", rank=" + rank +
                '}';
    }
}
