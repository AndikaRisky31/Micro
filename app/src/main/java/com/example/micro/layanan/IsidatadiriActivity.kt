package com.example.micro.layanan

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.micro.R

class IsidatadiriActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.datadiri1)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val data = listOf("Islam", "Kristen", "Budha","Hindu","kongHuCu")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, data)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Handle pemilihan opsi di sini
                val selectedOption = data[position]
                spinner.setSelection(position)
                Toast.makeText(applicationContext, "Anda memilih: $selectedOption", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle jika tidak ada yang dipilih
            }
        }


    }

}
