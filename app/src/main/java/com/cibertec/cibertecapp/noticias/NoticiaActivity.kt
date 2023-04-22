package com.cibertec.cibertecapp.noticias

import android.os.Bundle
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.cibertec.cibertecapp.R

class NoticiaActivity :AppCompatActivity() {

    val listaNoticias = listOf(
        Noticia("Noticia 01","Conaddadadadaasdqwqeqeqewqeqeqe1", R.drawable.noticias01),
        Noticia("asdadadaaasdada 02","Contenido 02", R.drawable.noticias02),
        Noticia("Noticia 03","qw 03", R.drawable.noticias03),
        Noticia("Noticia 03","qw 03", R.drawable.noticias03)
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noticias)

        val recyclerNoticias = findViewById<RecyclerView>(R.id.recyclerNoticias)
        recyclerNoticias.apply{
            // layoutManager = LinearLayoutManager(context)
            // layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            // layoutManager = GridLayoutManager(context,2)
            layoutManager = StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL)
            adapter = NoticiaAdapter(listaNoticias)
        }
    }
}