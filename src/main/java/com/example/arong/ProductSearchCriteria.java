package com.example.oop_final_project;

public class ProductSearchCriteria {

    private String nameKeyword;
    private String categoryKeyword;
    private String sizeKeyword;

    public ProductSearchCriteria(String categoryKeyword, String nameKeyword, String sizeKeyword) {
        this.categoryKeyword = categoryKeyword;
        this.nameKeyword = nameKeyword;
        this.sizeKeyword = sizeKeyword;
    }

    public String getNameKeyword() {
        return nameKeyword;
    }

    public void setNameKeyword(String nameKeyword) {
        this.nameKeyword = nameKeyword;
    }

    public String getCategoryKeyword() {
        return categoryKeyword;
    }

    public void setCategoryKeyword(String categoryKeyword) {
        this.categoryKeyword = categoryKeyword;
    }

    public String getSizeKeyword() {
        return sizeKeyword;
    }

    public void setSizeKeyword(String sizeKeyword) {
        this.sizeKeyword = sizeKeyword;
    }

    @Override
    public String toString() {
        return "ProductSearchCriteria{" +
                "nameKeyword='" + nameKeyword + '\'' +
                ", categoryKeyword='" + categoryKeyword + '\'' +
                ", sizeKeyword='" + sizeKeyword + '\'' +
                '}';
    }
}
