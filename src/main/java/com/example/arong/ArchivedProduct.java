package com.example.oop_final_project;

public class ArchivedProduct

{

    private int id;
    private String name;
    private String category;
    private String status;
    private String discontinuationReason;
    private boolean archived;

    public ArchivedProduct(int id, String name, String category, String status, String discontinuationReason, boolean archived) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.status = status;
        this.discontinuationReason = discontinuationReason;
        this.archived = archived;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public String getDiscontinuationReason() {
        return discontinuationReason;
    }

    public void setDiscontinuationReason(String discontinuationReason) {
        this.discontinuationReason = discontinuationReason;
    }

    @Override
    public String toString() {
        return "ArchivedProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", status='" + status + '\'' +
                ", discontinuationReason='" + discontinuationReason + '\'' +
                ", archived=" + archived +
                '}';
    }
}
