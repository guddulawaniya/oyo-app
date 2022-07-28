package com.example.oyo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebViewClient;

import com.example.oyo_app.databinding.ActivityTermConditionBinding;

public class term_condition_Activity extends AppCompatActivity {

    ActivityTermConditionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTermConditionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();
        binding.termconditiowebview.loadUrl("https://www.oyorooms.com/us/terms/");
        binding.termconditiowebview.getSettings().setJavaScriptEnabled(true);
        binding.termconditiowebview.setWebViewClient(new WebViewClient());
    }
}