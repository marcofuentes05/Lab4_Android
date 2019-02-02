package com.example.fuent.lab4

import android.app.Application

/**
 * Created by Marco Fuentes on 30/01/2019.
 */
class MyApplication: Application() {
    //Esta clase se encarga de almacenar la URL para evitar tener que hacer varias actividades para cada proyecto.
    private var url : String = "google.com"

    //Este metodo sirve para obtener la URL actual
    fun getUrl () : String {
        return this.url
    }

    // Este metodo sirve para declarar un nuevo URL
    fun setUrl(u:String){
        this.url = u
    }
}