package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class asianchicken extends AppCompatActivity {
    MediaPlayer mysong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asianchicken);
        mysong=MediaPlayer.create(asianchicken.this,R.raw.asianchicken);
    }
    public void play(View v){
        mysong.start();

    }
    @Override
    protected void onPause() {
        super.onPause();
        mysong.release();
    }

}
