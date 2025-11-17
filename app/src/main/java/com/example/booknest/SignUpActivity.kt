package com.example.booknest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp : AppCompatActivity() {

    private lateinit var signin:TextView;
    private lateinit var home:Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //move  to sign up page
        signin= findViewById(R.id.textView11)
        signin.setOnClickListener{
            val intent = Intent(this,SignIn::class.java);
            startActivity(intent)
        }

        //move  to Home page
        home= findViewById(R.id.SignIn)
        home.setOnClickListener{
            val intent = Intent(this,Home::class.java);
            startActivity(intent)
        }


    }
}