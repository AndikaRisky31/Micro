package com.example.micro.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.micro.R
import com.example.micro.home.AgendaActivity
import com.example.micro.home.ArtikelActivity
import com.example.micro.home.BantuanActivity
import com.example.micro.home.JanjiTemuActivity

class HomeFragment : Fragment() {
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val AgendaButton = view.findViewById<View>(R.id.buttonAgenda)
        val JanjiTemuButton = view.findViewById<View>(R.id.buttonJanjiTemu)
        val buttonBantuan = view.findViewById<View>(R.id.buttonbantuan)
        val artikel = view.findViewById<View>(R.id.image1)

        AgendaButton.setOnClickListener {
            val intent = Intent(context, AgendaActivity::class.java)
            startActivity(intent)
        }
        JanjiTemuButton.setOnClickListener {
            val intent = Intent(context, JanjiTemuActivity::class.java)
            startActivity(intent)
        }
        buttonBantuan.setOnClickListener{
            val intent = Intent(context,BantuanActivity::class.java)
            startActivity(intent)
        }
        artikel.setOnClickListener{
            val intent = Intent(context,ArtikelActivity::class.java)
            startActivity(intent)
        }
    }
}
