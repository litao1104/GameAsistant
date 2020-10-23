package com.example.uilytest;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SettingsFragment extends Fragment{

    private List<SettingsItem> itemList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.settings_frag, container, false);

        initItems();

        SettingsItemAdapter adapter = new SettingsItemAdapter(getActivity(), R.layout.settings_item, itemList);
        ListView listView = (ListView) view.findViewById(R.id.item_list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SettingsItem settingsItem = itemList.get(position);
                if (settingsItem.isEnabled() == SettingsItem.TYPE_DISABLED)
                    settingsItem.setEnabled(getContext(), SettingsItem.TYPE_ENABLED);
                else
                    settingsItem.setEnabled(getContext(), SettingsItem.TYPE_DISABLED);

                TextView textView = (TextView)view.findViewById(R.id.status);
                textView.setText(settingsItem.getStatus());
            }
        });

        Button check_button = (Button) view.findViewById(R.id.check);
        check_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                intent.putExtra("listdata", (Serializable)itemList);
                startActivity(intent);
            }
        });

        return view;
    }

    private void initItems() {
        SettingsItem neicunqingli = new SettingsItem(getContext(), R.drawable.function_neicun,
                getString(R.string.settings_item1), SettingsItem.TYPE_ENABLED);
        itemList.add(neicunqingli);

        SettingsItem wangsubaohu = new SettingsItem(getContext(), R.drawable.function_network,
                getString(R.string.settings_item2), SettingsItem.TYPE_ENABLED);
        itemList.add(wangsubaohu);

        SettingsItem fangwuchu = new SettingsItem(getContext(), R.drawable.function_fangwuchu,
                getString(R.string.settings_item3), SettingsItem.TYPE_ENABLED);
        itemList.add(fangwuchu);
    }
}
