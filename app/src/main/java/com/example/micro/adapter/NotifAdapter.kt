package com.example.micro.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.micro.model.ItemNotif
import com.example.micro.R

class NotifAdapter(private val itemList: List<ItemNotif>) : RecyclerView.Adapter<NotifAdapter.NotifViewHolder>() {

    inner class NotifViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.title)
        val statusTextView: TextView = itemView.findViewById(R.id.status)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotifViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.notif_list, parent, false)
        return NotifViewHolder(view)
    }

    override fun onBindViewHolder(holder: NotifViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.titleTextView.text = currentItem.title
        holder.statusTextView.text = currentItem.status
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}
