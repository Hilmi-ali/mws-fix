package com.example.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Splash : AppCompatActivity() {
    private lateinit var btnSplash : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)

        btnSplash = findViewById(R.id.btnSplash)

        btnSplash.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            /*intent.putExtra("email", tampungEmail)
            intent.putExtra("nama", tampungNama)*/
            startActivity(intent)

        }
    }
}