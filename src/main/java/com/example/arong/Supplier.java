package com.example.oop_final_project;

public class Supplier {

    private Long id;
    private String name;
    private String contactInfo;
    private String productLine;
    private boolean active;

    public Supplier(Long id, String name, String contactInfo, String productLine, boolean active) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.productLine = productLine;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", productLine='" + productLine + '\'' +
                ", active=" + active +
                '}';
    }
}
