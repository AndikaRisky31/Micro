package com.example.micro.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.micro.R
import com.example.micro.fragment.HomeFragment
import com.example.micro.fragment.LayananFragment
import com.example.micro.fragment.NotificationsFragment
import com.example.micro.fragment.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener{ menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_home -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.layanan -> {
                    replaceFragment(LayananFragment())
                    true
                }
                R.id.navigation_notifications -> {
                    replaceFragment(NotificationsFragment())
                    true
                }
                R.id.navigation_profiles -> {
                    replaceFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }

        // Tampilkan fragment awal (misalnya, HomeFragment)
        replaceFragment(HomeFragment())
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}
