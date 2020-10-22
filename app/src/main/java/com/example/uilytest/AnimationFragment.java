package com.example.uilytest;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import java.util.Timer;
import java.util.TimerTask;

public class AnimationFragment extends Fragment {

    private ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.animation_frag, container, false);
        imageView = (ImageView) view.findViewById(R.id.animation_image);

        imageView.setBackgroundResource(R.drawable.animation_list);
        AnimationDrawable animation = (AnimationDrawable)imageView.getBackground();
        animation.start();

        return view;
    }
}
