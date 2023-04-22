package com.cibertec.cibertecapp.biblioteca

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.R

class BibliotecaActivity : AppCompatActivity() {
    val listaBiblio = listOf(
        Biblioteca("La Pirámide Roja","Rick Riordan", "2010", "La historia comienza cuando Carter Kane y su padre, Julius Kane, van a Londres a visitar a Sadie, la hermana de Carter, que vive separado de ellos.Julius los lleva al Museo Británico para estudiar la Piedra de Rosetta.", R.drawable.piramide),
        Biblioteca("El trono de Fuego","Rick Riordan", "2011", "Desde que los dioses del antiguo Egipto se desataron en el mundo moderno, Carter Kane y su hermana Sadie han estado en problemas. Como descendientes de la Casa de la Vida, los Kane tienen algunos poderes a su mando, pero los dioses tortuosos no les han dado mucho tiempo para dominar sus", R.drawable.trono),
        Biblioteca("La Sombra de la Serpiente","Rick Riordan", "2012", "Cuando los jóvenes hermanos Carter y Sadie Kane aprendieron a usar la magia para seguir el camino de los dioses del Antiguo Egipto, sabían que iban a jugar un papel importante en la restauración de la Ma’at (el orden) en el mundo. Lo que no sospechaban era lo caótico que este se podía volver", R.drawable.serpiente)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biblioteca)

        val recyclerBiblio = findViewById<RecyclerView>(R.id.recyclerBiblioteca)
        recyclerBiblio.apply{
            layoutManager = LinearLayoutManager(context)
            // layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            // layoutManager = GridLayoutManager(context,2)
            // layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
            adapter = BibliotecaAdapter(listaBiblio)
        }
    }

}