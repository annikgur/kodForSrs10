package com.anatolyg.twofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigation: BottomNavigationView
    val firstFragment = FirstFragment()
    val secondFragment = SecondFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation = findViewById(R.id.bottom_navigation)

        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_1 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView2, firstFragment).commit()
                }
                R.id.page_2 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView2, secondFragment).commit()
                }
            }
            true
        }
    }
}
