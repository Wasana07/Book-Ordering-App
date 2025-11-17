package com.example.booknest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomeBg : AppCompatActivity() {

    private lateinit var signup:Button;
    private lateinit var signin:Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //move  front to sign up page
        signup = findViewById(R.id.SignUp)
        signup.setOnClickListener{
            val intent = Intent(this,SignUp::class.java);
            startActivity(intent)
        }
        //move  front to sign In page
        signin = findViewById(R.id.SignIn)
        signin.setOnClickListener{
            val intent = Intent(this,SignIn::class.java);
            startActivity(intent)
        }

    }
}