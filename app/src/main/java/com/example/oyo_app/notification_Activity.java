package com.example.oyo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class notification_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        getSupportActionBar().hide();
    }
}