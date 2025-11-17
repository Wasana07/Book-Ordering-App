package com.example.booknest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {

    private lateinit var profiletohome: ImageView
    private lateinit var profiletonoti: ImageView
    private lateinit var profiletocart: ImageView
    private lateinit var movesetting: ImageView
    private lateinit var moveeditpro:Button
    private lateinit var spage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        profiletohome = findViewById(R.id.protohome)
        profiletohome.setOnClickListener{
            val intent = Intent(this,Home::class.java);
            startActivity(intent)
        }

        profiletonoti = findViewById(R.id.protonoti)
        profiletonoti.setOnClickListener{
            val intent = Intent(this,Notification::class.java);
            startActivity(intent)
        }

        profiletocart = findViewById(R.id.protocart)
        profiletocart.setOnClickListener{
            val intent = Intent(this,Cart::class.java);
            startActivity(intent)
        }


        movesetting = findViewById(R.id.prosetting)
        movesetting.setOnClickListener{
            val intent = Intent(this, Setting::class.java);
            startActivity(intent)
        }

        moveeditpro = findViewById(R.id.EditProBtn)
        moveeditpro.setOnClickListener{
            val intent = Intent(this,EditProfile::class.java);
            startActivity(intent)
        }

        spage = findViewById(R.id.imageView55)
        spage.setOnClickListener{
            val intent = Intent(this, SherlockPage::class.java);
            startActivity(intent)
        }


    }
}