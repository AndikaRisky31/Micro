package com.example.micro.home

import com.example.micro.adapter.AgendaAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.micro.R
import com.example.micro.model.itemAgenda

class AgendaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.agenda)
        val itemList = listOf(
            itemAgenda("Gotong royong RT 003/RW 004","24-10-2023","Puskesmas Batu Gede",R.drawable.gotongroyong),
            itemAgenda("Imunisasi Anak Posyandu Mawar IIX", "23-09-2023","posyandu Batu Gede",R.drawable.posyandu),
            itemAgenda("Imunisasi Anak posyandu MELATI IIX","01-09-2023","Posyandu Mawar IIX",R.drawable.posyandu)
        )
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = AgendaAdapter(itemList)
        recyclerView.adapter = adapter
    }
}