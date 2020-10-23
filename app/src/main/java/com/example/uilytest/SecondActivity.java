package com.example.uilytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        List<SettingsItem> itemList = (List<SettingsItem>)intent.getSerializableExtra("listdata");

        Log.d("litao", "list size is " + itemList.size());

        for (SettingsItem settingsItem : itemList) {
            if (settingsItem.isEnabled() == SettingsItem.TYPE_DISABLED) {
                itemList.remove(settingsItem);
            }
        }

        //for (int index = 0; index < itemList.size(); index++) {
        //    Log.d("litao1", "item.Name is " + itemList.get(index).getName());
        //    Log.d("litao2", "item.isEnabled is " + itemList.get(index).isEnabled());
        //    Log.d("litao3", "item.Status is " + itemList.get(index).getStatus());
        //    if (itemList.get(index).isEnabled() == SettingsItem.TYPE_DISABLED) {
        //        Log.d("litao", "index = " + index);
        //        itemList.remove(index);
        //        index--;
        //    }
        //}

        Log.d("litao5", "list size is " + itemList.size());

        StatusItemAdapter adapter = new StatusItemAdapter(SecondActivity.this, R.layout.status_item, itemList);
        ListView listView = (ListView) findViewById(R.id.status_list_view);
        listView.setAdapter(adapter);
    }
}