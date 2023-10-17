package com.example.micro.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.micro.R
import com.example.micro.home.AgendaActivity

class HomeFragment : Fragment() {
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Temukan elemen dengan ID ic_suratpengantar
        val AgendaButton = view.findViewById<View>(R.id.buttonAgenda)

        // Tambahkan OnClickListener untuk elemen tersebut
        AgendaButton.setOnClickListener {
            // Buat Intent untuk berpindah ke AgendaActivity
            val intent = Intent(context, AgendaActivity::class.java)
            // Mulai activity
            startActivity(intent)
        }
    }
}
