package com.example.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    private lateinit var btnLogin : Button
    private lateinit var daftar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        btnLogin = findViewById(R.id.btnLogin)
        daftar = findViewById(R.id.daftar)

        btnLogin.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            /*intent.putExtra("email", tampungEmail)
            intent.putExtra("nama", tampungNama)*/
            startActivity(intent)
        }
        daftar.setOnClickListener{
            val intent = Intent(this, Register::class.java)
            /*intent.putExtra("email", tampungEmail)
            intent.putExtra("nama", tampungNama)*/
            startActivity(intent)
    }
}
}