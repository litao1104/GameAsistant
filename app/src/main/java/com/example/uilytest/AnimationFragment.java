package com.example.uilytest;

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

    private Timer timer;
    private long delay = 200;
    private long intervalPeriod = 200;

    private int animationPicId = 1;

    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            Message message = new Message();
            message.what = animationPicId++;

            if (animationPicId > 12) {
                animationPicId = 1;
            }

            handler.sendMessage(message);
            Log.d("litao", "liyang111");
        }
    };

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            Log.d("litao", "liyang222");

            switch (msg.what) {
                case 1:
                    imageView.setImageResource(R.drawable.pic_san1);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.pic_san2);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.pic_san3);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.pic_san4);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.pic_san5);
                    break;
                case 6:
                    imageView.setImageResource(R.drawable.pic_san6);
                    break;
                case 7:
                    imageView.setImageResource(R.drawable.pic_san7);
                    break;
                case 8:
                    imageView.setImageResource(R.drawable.pic_san8);
                    break;
                case 9:
                    imageView.setImageResource(R.drawable.pic_san9);
                    break;
                case 10:
                    imageView.setImageResource(R.drawable.pic_san10);
                    break;
                case 11:
                    imageView.setImageResource(R.drawable.pic_san11);
                    break;
                case 12:
                    imageView.setImageResource(R.drawable.pic_san12);
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.animation_frag, container, false);
        imageView = (ImageView) view.findViewById(R.id.animation_image);
        timer = new Timer();
        timer.scheduleAtFixedRate(task, delay, intervalPeriod);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        timer.cancel();
    }
}
