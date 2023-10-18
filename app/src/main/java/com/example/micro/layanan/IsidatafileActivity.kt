package com.example.micro.layanan

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.micro.R
import com.example.micro.home.MenuActivity

class IsidatafileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.datadiri2)

        val showConfirmationButton = findViewById<Button>(R.id.buttonkirim)

        showConfirmationButton.setOnClickListener {
            showConfirmationPopup()
        }

    }

    private fun showConfirmationPopup() {
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
