package com.example.booknest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {

    private lateinit var sherlock_page: Button
    private lateinit var homeNoti1: ImageView
    private lateinit var cart_1: ImageView
    private lateinit var profile010: ImageView
    private lateinit var profile011: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        sherlock_page = findViewById(R.id.seemore)
        sherlock_page.setOnClickListener{
            val intent = Intent(this, SherlockPage::class.java);
            startActivity(intent)
        }

        homeNoti1 = findViewById(R.id.notification1)
        homeNoti1.setOnClickListener{
            val intent = Intent(this, Notification::class.java);
            startActivity(intent)
        }

        cart_1 = findViewById(R.id.cart001)
        cart_1.setOnClickListener{
            val intent = Intent(this,Cart::class.java);
            startActivity(intent)
        }



        profile010 = findViewById(R.id.profile_1)
        profile010.setOnClickListener{
            val intent = Intent(this, Profile::class.java);
            startActivity(intent)
        }


        profile011 = findViewById(R.id.Homepro)
        profile011.setOnClickListener{
            val intent = Intent(this, Profile::class.java);
            startActivity(intent)
        }



    }
}