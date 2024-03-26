package com.example.androidproject;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WebView3D extends AppCompatActivity {
    WebView web3D;
    private static final String LOCALHOST_URL = "http://192.168.56.1:8080";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view3_d) ;

        web3D = findViewById(R.id.web3D);
        web3D.getSettings().setJavaScriptEnabled(true);
        web3D.setWebViewClient(new WebViewClient());
        web3D.setWebChromeClient(new WebChromeClient());
        web3D.loadUrl(LOCALHOST_URL);

    }
}