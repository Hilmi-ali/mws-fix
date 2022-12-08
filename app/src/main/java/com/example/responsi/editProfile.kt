package com.example.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class editProfile : AppCompatActivity() {

    private lateinit var btnBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_edit_profile)

        btnBack = findViewById(R.id.btnEProf)

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            /*intent.putExtra("email", tampungEmail)
            intent.putExtra("nama", tampungNama)*/
            startActivity(intent)

        }
    }
}