package com.example.booknest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.booknest.WelcomeBg

class OnboardScreen3 : AppCompatActivity() {

    private lateinit var imageView1: ImageView
    private lateinit var moveback:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        imageView1 = findViewById(R.id.getstartbtn)
        imageView1.setOnClickListener{
            val intent = Intent(this, WelcomeBg::class.java);
            startActivity(intent)
        }

        //move back to onboardScreen 2
        moveback = findViewById(R.id.MoveBack3)
        moveback.setOnClickListener{
            val intent = Intent(this,OnboardScreen2::class.java);
            startActivity(intent)
        }


    }
}