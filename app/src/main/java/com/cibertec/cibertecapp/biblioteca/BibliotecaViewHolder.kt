package com.cibertec.cibertecapp.biblioteca

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.R

class BibliotecaViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(
    R.layout.item_biblioteca, parent, false)) {

    private var fotoPelicula : ImageView? = null
    private var txtTituloPelicula : TextView? = null
    private var txtAnio: TextView? = null
    private var txtDir: TextView? = null
    private var txtDesc: TextView? = null

    init{
        fotoPelicula = itemView.findViewById(R.id.fotoPelicula)
        txtTituloPelicula = itemView.findViewById(R.id.txtTituloPelicula)
        txtAnio = itemView.findViewById(R.id.txtAnio)
        txtDir = itemView.findViewById(R.id.txtDir)
        txtDesc = itemView.findViewById(R.id.txtDesc)
    }

    fun bind(biblioteca: Biblioteca) {
        txtTituloPelicula?.text = biblioteca.tituloPeli
        txtAnio?.text = biblioteca.anio
        txtDir?.text = biblioteca.director
        txtDesc?.text = biblioteca.desc
        fotoPelicula?.setImageResource(biblioteca.foto)

    }
}