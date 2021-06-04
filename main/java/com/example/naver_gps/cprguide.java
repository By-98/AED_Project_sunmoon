package com.example.naver_gps;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class cprguide extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cprguide);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();



    }
}