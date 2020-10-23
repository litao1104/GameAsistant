package com.example.uilytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView neiCunQingLiText = (TextView) findViewById(R.id.neicunqingli_text);
        TextView wangSuBaoHuText = (TextView) findViewById(R.id.wangsubaohu_text);
        TextView fangWuChuText = (TextView) findViewById(R.id.fangwuchu_text);

        Intent intent = getIntent();
        List<SettingsItem> itemList = (List<SettingsItem>)intent.getSerializableExtra("listdata");

        for (int index = 0; index < itemList.size(); index++) {
            SettingsItem settingsItem = (SettingsItem)itemList.get(index);

            if (settingsItem.getName().equals(getString(R.string.settings_item1))) {
                   if (settingsItem.isEnabled() == SettingsItem.TYPE_DISABLED) {
                    neiCunQingLiText.setVisibility(View.INVISIBLE);
                }
            } else if (settingsItem.getName().equals(getString(R.string.settings_item2))) {
                if (settingsItem.isEnabled() == SettingsItem.TYPE_DISABLED) {
                    wangSuBaoHuText.setVisibility(View.INVISIBLE);
                }
            } else if (settingsItem.getName().equals(getString(R.string.settings_item3))) {
                if (settingsItem.isEnabled() == SettingsItem.TYPE_DISABLED) {
                    fangWuChuText.setVisibility(View.INVISIBLE);
                }
            }
        }
    }
}