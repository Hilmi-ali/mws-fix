package com.example.responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var btmMenu : BottomNavigationView
    private lateinit var fragment : FragmentContainerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btmMenu = findViewById(R.id.bottomNav)
        fragment = findViewById(R.id.fragmentContainer)

        btmMenu.setOnItemReselectedListener {
            when (it.itemId){
                R.id.home -> {
                    replaceFragment(Home())
                }
                R.id.promo -> {
                    replaceFragment(Promo())
                }
                R.id.member -> {
                    replaceFragment(MyMember())
                }
                R.id.setting -> {
                    replaceFragment(Setting())
                }
                else -> {

                }
            }
            true
        }

    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }
}