package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Login_form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_form)
        val login: Button = findViewById(R.id.login)

        val username: EditText = findViewById(R.id.editTextTextPersonName)
        val password: EditText = findViewById(R.id.editTextTextPassword2)

        login.setOnClickListener {

            val usernameInput: String = username.text.toString()
            val passwordInput: String = password.text.toString()

            if (usernameInput == "" || passwordInput == "") {
                if (usernameInput == "") {
                    Toast.makeText(this, "Enter username",
                            Toast.LENGTH_LONG).show()
                }
                if (passwordInput == "") {
                    Toast.makeText(this, "Enter password",
                            Toast.LENGTH_LONG).show()
                }
            }
            else {
                val intent = Intent(this, CategoryList::class.java)
                startActivity(intent)
            }
        }

        val openRegister: Button = findViewById(R.id.open_register)
        openRegister.setOnClickListener {
            val intent = Intent(this, Register_form::class.java)
            startActivity(intent)
        }
    }
}