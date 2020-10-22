package com.example.uilytest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class SettingsFragment extends Fragment {

    private List<SettingsItem> itemList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.settings_frag, container, false);

        initItems();

        SettingsItemAdapter adapter = new SettingsItemAdapter(getActivity(), R.layout.settings_item, itemList);
        ListView listView = (ListView) view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        return view;
    }

    private void initItems() {
        SettingsItem neicunqingli = new SettingsItem(R.drawable.function_neicun,
                getString(R.string.settings_item1), getString(R.string.status_disabled));
        itemList.add(neicunqingli);

        SettingsItem wangsubaohu = new SettingsItem(R.drawable.function_network,
                getString(R.string.settings_item2), getString(R.string.status_disabled));
        itemList.add(wangsubaohu);

        SettingsItem fangwuchu = new SettingsItem(R.drawable.function_fangwuchu,
                getString(R.string.settings_item3), getString(R.string.status_disabled));
        itemList.add(fangwuchu);
    }
}
