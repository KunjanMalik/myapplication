package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register_form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_form)

        val register: Button = findViewById(R.id.register)
        register.setOnClickListener {
            val intent = Intent(this, Login_form::class.java)
            startActivity(intent)
        }

        val openLogin: Button = findViewById(R.id.open_login)
        openLogin.setOnClickListener {
            val intent = Intent(this, Login_form::class.java)
            startActivity(intent)
        }
    }
}