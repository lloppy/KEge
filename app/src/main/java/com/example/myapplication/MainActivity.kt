package com.example.myapplication

import android.os.Bundle
import android.util.Base64
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var myWebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // webView.settings.javaScriptEnabled = true;

        myWebView = findViewById(R.id.webView)
        myWebView.loadUrl("https://kpolyakov.spb.ru/school/ege/generate.htm")

        //onBackPressed()

    }


    override fun onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack()
        } else {
            super.onBackPressed()
        }
    }


}