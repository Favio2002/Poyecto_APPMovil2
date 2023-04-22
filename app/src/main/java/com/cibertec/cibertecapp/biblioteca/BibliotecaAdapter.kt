package com.cibertec.cibertecapp.biblioteca

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView



class BibliotecaAdapter(val list:List<Biblioteca>): RecyclerView.Adapter<BibliotecaViewHolder>() {

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BibliotecaViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return BibliotecaViewHolder(inflater, parent)
    }



    override fun onBindViewHolder(holder: BibliotecaViewHolder, position: Int) {
        val biblioteca: Biblioteca = list[position]
        holder.bind(biblioteca)
    }

}