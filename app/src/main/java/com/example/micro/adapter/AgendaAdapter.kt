package com.example.micro.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.micro.R
import com.example.micro.model.itemAgenda

class AgendaAdapter(private val itemList: List<itemAgenda>) : RecyclerView.Adapter<AgendaAdapter.AgendaViewHolder>() {

    inner class AgendaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titleAgenda)
        val jadwalTextView: TextView = itemView.findViewById(R.id.jadwal)
        val tempatTextView: TextView = itemView.findViewById(R.id.tempat)
        val gambarAgenda: ImageView = itemView.findViewById(R.id.gambarAgenda)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgendaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.agenda_list, parent, false)
        return AgendaViewHolder(view)
    }

    override fun onBindViewHolder(holder: AgendaViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.titleTextView.text = currentItem.titleAgenda
        holder.jadwalTextView.text = ("Jadwal : "+currentItem.jadwal)
        holder.tempatTextView.text = ("Tempat : "+currentItem.tempat)
        holder.gambarAgenda.setImageResource(currentItem.imageResourceId)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}
