package com.example.booknest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnboardScreen2 : AppCompatActivity() {

    private lateinit var moveNext3:Button;
    private lateinit var moveback003:Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //move back to onboardScreen 1
        moveback003 = findViewById(R.id.MoveBack)
        moveback003.setOnClickListener{
            val intent = Intent(this,OnboardingScreen::class.java);
            startActivity(intent)
        }

        //move Next to OnboardScreen 3
        moveNext3 = findViewById(R.id.MoveNext3)
        moveNext3.setOnClickListener{
            val intent = Intent(this, OnboardScreen3::class.java);
            startActivity(intent)
        }
    }
}