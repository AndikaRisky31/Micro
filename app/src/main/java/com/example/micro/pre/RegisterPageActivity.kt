package com.example.micro.pre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.micro.R

class RegisterPageActivity : AppCompatActivity() {
    private lateinit var buttonSignUp:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registerpage)

        buttonSignUp = findViewById(R.id.buttonSignUp)

        buttonSignUp.setOnClickListener(){
            handleButtonSignUp()
        }

    }
    private fun handleButtonSignUp(){
        val intent = Intent(this,LoginPageActivity::class.java)
        startActivity(intent)
    }
}