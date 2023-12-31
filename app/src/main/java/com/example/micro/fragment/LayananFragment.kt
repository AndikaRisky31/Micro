package com.example.micro.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.micro.R
import com.example.micro.home.prasyaratActivity
import com.example.micro.layanan.IsidatadiriActivity

class LayananFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_layanan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myButton = view.findViewById<View>(R.id.suratpengantar)
        val buttonprasyarat = view.findViewById<View>(R.id.image2)

        myButton.setOnClickListener {
            val intent = Intent(context, IsidatadiriActivity::class.java)
            startActivity(intent)
        }
        buttonprasyarat.setOnClickListener{
            val intent = Intent(context,prasyaratActivity::class.java)
            startActivity(intent)
        }
    }
}
