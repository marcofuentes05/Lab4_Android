package com.example.fuent.lab4

import android.app.Application
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        val myWebView = WebView(this)
        setContentView(myWebView)


        var url : String = (this.application as MyApplication).getUrl()

        myWebView.loadUrl(url)
        myWebView.webViewClient = WebViewClient()
    }


}
