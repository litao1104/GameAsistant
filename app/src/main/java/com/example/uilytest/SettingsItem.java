package com.example.uilytest;

import android.content.Context;

public class SettingsItem {

    private int imageId;

    private String name;

    private String status;

    private boolean enabled;

    public SettingsItem(Context context, int imageId, String name, boolean enabled) {
        this.imageId = imageId;
        this.name = name;
        this.enabled = enabled;

        if (enabled)
            setStatus(context.getString(R.string.status_enabled));
        else
            setStatus(context.getString(R.string.status_disabled));
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

    private void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setEnabled(Context context, boolean enabled) {
        this.enabled = enabled;

        if (enabled)
            setStatus(context.getString(R.string.status_enabled));
        else
            setStatus(context.getString(R.string.status_disabled));
    }

    public boolean isEnabled() {
        return enabled;
    }
}
