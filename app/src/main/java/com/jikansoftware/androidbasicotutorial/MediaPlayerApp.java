package com.jikansoftware.androidbasicotutorial;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MediaPlayerApp extends AppCompatActivity {
    Button start, pause, stop;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_player);

        start = findViewById(R.id.buttonPlay);
        pause = findViewById(R.id.buttonPause);
        stop = findViewById(R.id.buttonStop);

        final MediaPlayer mp = new MediaPlayer();

        try {
            mp.setDataSource(Environment.getExternalStorageDirectory().getPath()+"Android/Music/Somehow_Satan_Got_Behind_Me.mp3");

            mp.prepare();

        } catch (Exception e) {
            e.printStackTrace();
        }

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });
    }
}
