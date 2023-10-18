package com.example.micro.home

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import com.example.micro.R

class BantuanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bantuan)
        val kirimButton = findViewById<Button>(R.id.buttonbantuan)
        kirimButton.setOnClickListener {
            handleButton()
        }
    }
    private fun handleButton(){
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