package com.example.naver_gps;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
import android.widget.ImageButton;


public class chestcompressionsguide extends AppCompatActivity implements View.OnClickListener {

    ImageButton systemBeepBtnon;
    ImageButton systemBeepBtnoff;
    Button aedfind_btn;
    Button chestcompressionsguide_btn;
    Button cprguide_btn;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chestcompressionsguide);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        player = MediaPlayer.create(this, R.raw.sound);
        systemBeepBtnon = findViewById(R.id.btn_beepon);
        systemBeepBtnoff = findViewById(R.id.btn_beepoff);
        systemBeepBtnon.setOnClickListener(this);
        systemBeepBtnoff.setOnClickListener(this);

        aedfind_btn = findViewById(R.id.aedfind_btn);
        chestcompressionsguide_btn = findViewById(R.id.chestcompressionsguide_btn);
        cprguide_btn = findViewById(R.id.cprguide_btn);


        aedfind_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chestcompressionsguide.this, MainActivity.class);
                startActivity(intent);
            }
        });

        chestcompressionsguide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chestcompressionsguide.this, chestcompressionsguide.class);
                startActivity(intent);
            }
        });

        cprguide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chestcompressionsguide.this, MenuActivity.class);
                startActivity(intent);
            }

        });
    }

    @Override
    public void onClick(View v) {

        if (v == systemBeepBtnon) {
            player.start();
        }
        if (v == systemBeepBtnoff) {
            player.stop();
            player = MediaPlayer.create(this, R.raw.sound);
        }

    }
}