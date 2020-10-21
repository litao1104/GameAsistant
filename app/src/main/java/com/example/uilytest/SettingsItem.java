package com.example.uilytest;

public class SettingsItem {

    private int imageId;

    private String name;

    private String status;

    public SettingsItem(int imageId, String name, String status) {
        this.imageId = imageId;
        this.name = name;
        this.status = status;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
