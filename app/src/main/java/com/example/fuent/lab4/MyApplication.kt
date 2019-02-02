package com.example.fuent.lab4

import android.app.Application

/**
 * Created by fuent on 30/01/2019.
 */
class MyApplication: Application() {
    private var url : String = "google.com"

    fun getUrl () : String {
        return this.url
    }

    fun setUrl(u:String){
        this.url = u
    }
}