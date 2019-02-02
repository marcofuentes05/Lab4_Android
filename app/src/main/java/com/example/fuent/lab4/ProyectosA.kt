package com.example.fuent.lab4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class ProyectosA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proyectos)

        // esta variable identifica la listView de la actividad
        val listaM: ListView = findViewById(R.id.lista)

        // Esta matriz almacena los objetos que se mostrarán  en la listView
        val matriz = arrayOf("Lab 2 de Android", "Este proyecto (Android)", "Hoja de trabajo 1 de Estructuras")


        //El adapter sirve para conectar la matriz con el listView
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, matriz)
        listaM.adapter = adapter

        listaM.isClickable = true

        var a :String = ""

        // Este metodo asigna un String url dependiendo dle objeto que se seleccione en la lista
        // Este URL se manda a la clase MyApplication para que desde alli pueda irse a la actividad de webView
        listaM.onItemClickListener = AdapterView.OnItemClickListener{ arg0, arg1, position, arg3 ->
            if (position==0){
                a = "https://github.com/marcofuentes05/Moviles/tree/master/Lab2"

            }else if(position == 1){
                a = "https://github.com/marcofuentes05/Lab4_Android"
            }else{
                a = "https://github.com/marcofuentes05/EstructuraDeDatos/tree/master/HT1"
            }
            (this.application as MyApplication).setUrl(a)
            val intent = Intent (this, WebActivity::class.java)
            startActivity(intent)
        }

    }
}