package com.example.booknest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SherlockPage : AppCompatActivity() {

    private lateinit var sherlock_back: ImageView
    private lateinit var addtocartbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sherlock)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        sherlock_back = findViewById(R.id.imageView30)
        sherlock_back.setOnClickListener{
            val intent = Intent(this, Home::class.java);
            startActivity(intent)
        }

        addtocartbtn = findViewById(R.id.S_addtocart)
        addtocartbtn.setOnClickListener{
            val intent = Intent(this,Cart::class.java);
            startActivity(intent)
        }


    }
}