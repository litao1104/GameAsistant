package com.example.uilytest;

import android.content.Context;

import java.io.Serializable;

public class SettingsItem implements Serializable {

    public static final int TYPE_DISABLED = 0;
    public static final int TYPE_ENABLED = 1;

    private int imageId;

    private String name;

    private String status;

    private int enabled;

    public SettingsItem(Context context, int imageId, String name, int enabled) {
        this.imageId = imageId;
        this.name = name;
        this.enabled = enabled;

        if (enabled == TYPE_ENABLED)
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

    public void setEnabled(Context context, int enabled) {
        this.enabled = enabled;

        if (enabled == TYPE_ENABLED)
            setStatus(context.getString(R.string.status_enabled));
        else
            setStatus(context.getString(R.string.status_disabled));
    }

    public int isEnabled() {
        return enabled;
    }
}
