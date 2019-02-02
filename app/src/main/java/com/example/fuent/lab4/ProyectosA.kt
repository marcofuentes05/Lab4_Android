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


        val listaM: ListView = findViewById(R.id.lista)

        val matriz = arrayOf("Lab 2 de Android", "Este proyecto (Android)", "Hoja de trabajo 1 de Estructuras")


        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, matriz)
        listaM.adapter = adapter

        listaM.isClickable = true
        var a :String = ""
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




    /**override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val matriz = arrayOf("Hamburguesa","Papas","Gaseosas","Pizza","Dulces","Ensalada")

        val lista : ListView = findViewById(R.id.listaMenu)

        val adapter : ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,matriz)
        lista.adapter = adapter


        lista.isClickable = true
        lista.onItemClickListener = AdapterView.OnItemClickListener { arg0, arg1, position, arg3 ->
            val s: MenuOrderImp = (this.application as MyAplication).getOrden()
            s.add(matriz.get(position))

            val toast1: Toast = Toast.makeText(applicationContext,"Se ha agregado '"+matriz.get(position)+"' a tu orden", Toast.LENGTH_LONG)
            toast1.show()

        }

    }**/


}

