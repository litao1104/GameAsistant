package com.example.uilytest;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SettingsItemAdapter extends ArrayAdapter<SettingsItem> {
    private int layoutResId1;

    public SettingsItemAdapter(Context context, int layoutResId, List<SettingsItem> objects) {
        super(context, layoutResId, objects);
        layoutResId1 = layoutResId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SettingsItem settingsItem = getItem(position);

        View view = LayoutInflater.from(getContext()).inflate(layoutResId1, parent, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.item_image);
        TextView functionView = (TextView) view.findViewById(R.id.function_name);
        TextView statusView = (TextView) view.findViewById(R.id.status);

        imageView.setImageResource(settingsItem.getImageId());
        functionView.setText(settingsItem.getName());
        statusView.setText(settingsItem.getStatus());

        return view;
    }
}
