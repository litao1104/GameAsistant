package com.example.uilytest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StatusItemAdapter extends ArrayAdapter<SettingsItem> {
    private int layoutResId;

    public StatusItemAdapter(Context context, int layoutResId, List<SettingsItem> objects) {
        super(context, layoutResId, objects);
        this.layoutResId = layoutResId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SettingsItem settingsItem = getItem(position);

        View view = LayoutInflater.from(getContext()).inflate(layoutResId, parent, false);

        TextView statusView = (TextView) view.findViewById(R.id.item_status);

        statusView.setText(settingsItem.getName());

        return view;
    }
}
