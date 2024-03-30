package com.example.androidproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class HomeFragment extends Fragment {

    WebView web3D;
    private static final String LOCALHOST_URL = "http://192.168.56.1:8080";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        web3D = view.findViewById(R.id.web3D);
        web3D.getSettings().setJavaScriptEnabled(true);
        web3D.setWebViewClient(new WebViewClient());
        web3D.setWebChromeClient(new WebChromeClient());
        web3D.loadUrl(LOCALHOST_URL);
        return view;
    }
}
