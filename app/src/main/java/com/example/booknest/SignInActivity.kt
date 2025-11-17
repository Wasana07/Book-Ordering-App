package com.example.booknest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignIn : AppCompatActivity() {

    private lateinit var signup: Button;
    private lateinit var home2: Button;

    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //move  to sign up page
        signup = findViewById(R.id.SignUp2)
        signup.setOnClickListener{
            val intent = Intent(this, SignUp::class.java);
            startActivity(intent)
        }

        //move  to Home page
        home2= findViewById(R.id.SignIn3)
        home2.setOnClickListener{
            val intent = Intent(this,Home::class.java);
            startActivity(intent)
        }
    }
}