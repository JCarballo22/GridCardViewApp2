package com.example.gridcardviewapp2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var gvTabla:GridView?=null

    var nombre = arrayListOf<String>(
        "Mario",
        "Mariel",
        "Paola",
        "Marvin"
    )
    var departamento = arrayListOf<String>(
        "Sonsonate",
        "Caballas",
        "San Salvador",
        "La Paz"
    )
    var imagenes = arrayOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4
    )

    var imagenesLista = arrayOf(
        ImgItems(imagenes.get(0),nombre.get(0),departamento.get(0)),
        ImgItems(imagenes.get(1),nombre.get(1),departamento.get(1)),
        ImgItems(imagenes.get(2),nombre.get(2),departamento.get(2)),
        ImgItems(imagenes.get(3),nombre.get(3),departamento.get(3))

    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}

