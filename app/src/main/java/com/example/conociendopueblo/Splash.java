package com.example.conociendopueblo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    MediaPlayer intro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        intro = MediaPlayer.create(this, R.raw.cucharita_splash);
        intro.start();

        TimerTask timer = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Home.class);
                startActivity(intent);
                finish();
            }
        };
        Timer time = new Timer();
        time.schedule(timer, 4000);
    }
}