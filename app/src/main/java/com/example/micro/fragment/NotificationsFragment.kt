package com.example.micro.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.micro.adapter.NotifAdapter
import com.example.micro.model.ItemNotif
import com.example.micro.R

class NotificationsFragment : Fragment() {

    private val itemList = listOf(
        ItemNotif("Pengajuan Surat Pengantar RW 001/RT007 Atas Nama Mukidin Sibarani", "Dalam Proses"),
        ItemNotif("Pengajuan Surat Pengantar RW 001/RT007 Atas Nama Mukidin Sibarani", "Selesai")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_notifications, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = NotifAdapter(itemList)
        return view
    }
}