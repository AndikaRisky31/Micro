package com.example.micro.pre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView // Ganti dengan import yang benar untuk TextView
import com.example.micro.R
import com.example.micro.home.HomepageActivity

class LoginPageActivity : AppCompatActivity() {
    private lateinit var buttonLogin: Button // Deklarasikan buttonLogin sebagai properti
    private lateinit var linkSignUp:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginpage)

        buttonLogin = findViewById(R.id.buttonLogin) // Inisialisasikan buttonLogin
        linkSignUp = findViewById(R.id.tolinkSignUp) // Ganti nama variabel

        // Panggil fungsi untuk menangani klik tombol login
        buttonLogin.setOnClickListener {
            handleLoginClick()
        }
        linkSignUp.setOnClickListener{
            handleToSignUpClick()
        }

    }

    private fun handleLoginClick() {
        val intent = Intent(this, HomepageActivity::class.java)
        startActivity(intent)
    }
    private fun handleToSignUpClick(){
        val intent = Intent(this,RegisterPageActivity::class.java)
        startActivity(intent)
    }
}
