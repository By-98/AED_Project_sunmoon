package com.example.findaed;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chestcompressionsguide extends AppCompatActivity {

    Button aedfind_btn;
    Button chestcompressionsguide_btn;
    Button cprguide_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chestcompressionsguide);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        aedfind_btn=findViewById(R.id.aedfind_btn);
        chestcompressionsguide_btn = findViewById(R.id.chestcompressionsguide_btn);
        cprguide_btn = findViewById(R.id.cprguide_btn);

        aedfind_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chestcompressionsguide.this, AEDActivity.class);
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
                Intent intent = new Intent(chestcompressionsguide.this, cprguide.class);
                startActivity(intent);
            }
        });

    }
}