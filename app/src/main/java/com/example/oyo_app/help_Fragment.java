package com.example.oyo_app;

import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.oyo_app.databinding.FragmentHelpBinding;

public class help_Fragment extends Fragment {

    FragmentHelpBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHelpBinding.inflate(inflater, container,false);
        binding.helpwebview.loadUrl("https://www.youtube.com/");
        binding.helpwebview.getSettings().setJavaScriptEnabled(true);
        binding.helpwebview.setWebViewClient(new WebViewClient());
        // Inflate the layout for this fragment

        return binding.getRoot();
    }

    public class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            binding.webviewprogressbar.setVisibility(View.GONE);
        }
    }
}