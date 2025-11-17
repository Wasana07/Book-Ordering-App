package com.example.booknest

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Cart : AppCompatActivity() {

    private lateinit var carttoprofile01: ImageView
    private lateinit var movebacktoimage: ImageView
    private lateinit var cartnoti: ImageView
    private lateinit var carthome: ImageView
    private lateinit var move33: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cart)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        carttoprofile01 = findViewById(R.id.carttoprofile)
        carttoprofile01.setOnClickListener{
            val intent = Intent(this, Profile::class.java);
            startActivity(intent)
        }

        cartnoti = findViewById(R.id.carttobell)
        cartnoti.setOnClickListener{
            val intent = Intent(this, Notification::class.java);
            startActivity(intent)
        }
        carthome = findViewById(R.id.imageView18)
        carthome.setOnClickListener{
            val intent = Intent(this, Home::class.java);
            startActivity(intent)
        }
        movebacktoimage = findViewById(R.id.imageView40)
        movebacktoimage.setOnClickListener{
            val intent = Intent(this, SherlockPage::class.java);
            startActivity(intent)
        }



        move33 = findViewById(R.id.imageView48)
        move33.setOnClickListener{
            val intent = Intent(this, successfull::class.java);
            startActivity(intent)
        }

    }
}