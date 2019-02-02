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

        //esta variable almacena la URL del repositorio del proyecto que se seleccionó en la actividad ProyectosA.
        var url : String = (this.application as MyApplication).getUrl()

        //Se carga la URL
        myWebView.loadUrl(url)
        myWebView.webViewClient = WebViewClient()
    }
}