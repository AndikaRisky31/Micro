package com.example.micro.home

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import com.example.micro.R

class JanjiTemuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.janji_temu)
        val kirimButton = findViewById<Button>(R.id.kirim_button)
        kirimButton.setOnClickListener {
            handleKirimButton()
        }
    }
    private fun handleKirimButton(){
        val dialogView = LayoutInflater.from(this).inflate(R.layout.popup_isidatadiri, null)

        val builder = AlertDialog.Builder(this)
        builder.setView(dialogView)
        val alertDialog = builder.create()

        val confirmButton = dialogView.findViewById<Button>(R.id.confirm_button)

        confirmButton.setOnClickListener {
            alertDialog.dismiss()
            val menuIntent = Intent(this, MenuActivity::class.java)
            startActivity(menuIntent)
        }


        alertDialog.show()
    }
}