package com.example.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RiwayatActivate : AppCompatActivity() {

    private lateinit var btnBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_riwayat_activate)

        btnBack = findViewById(R.id.btnRwyt)

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            /*intent.putExtra("email", tampungEmail)
            intent.putExtra("nama", tampungNama)*/
            startActivity(intent)

        }
    }
}