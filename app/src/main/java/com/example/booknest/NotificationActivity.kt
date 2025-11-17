package com.example.booknest

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Notification : AppCompatActivity() {

    private lateinit var belltohome: ImageView
    private lateinit var belltocart: ImageView
    private lateinit var movebackhome: ImageView
    private lateinit var belltoprofile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_notification)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        belltohome = findViewById(R.id.imageView18)
        belltohome.setOnClickListener{
            val intent = Intent(this,Home::class.java);
            startActivity(intent)
        }

        belltocart = findViewById(R.id.imageView20)
        belltocart.setOnClickListener{
            val intent = Intent(this,Cart::class.java);
            startActivity(intent)
        }

        movebackhome = findViewById(R.id.notiback)
        movebackhome.setOnClickListener{
            val intent = Intent(this,Home::class.java);
            startActivity(intent)
        }


        belltoprofile = findViewById(R.id.imageView21)
        belltoprofile.setOnClickListener{
            val intent = Intent(this, Profile::class.java);
            startActivity(intent)
        }


    }
}