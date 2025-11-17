package com.example.booknest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnboardingScreen : AppCompatActivity() {

    private lateinit var moveNext2: Button
    private lateinit var moveskip: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        moveNext2 = findViewById(R.id.MoveNext2)
        moveNext2.setOnClickListener {
            val intent = Intent(this, OnboardScreen2::class.java)
            startActivity(intent)
        }

        //skip button
        moveskip = findViewById(R.id.Skip)
        moveskip.setOnClickListener {
            val intent = Intent(this, WelcomeBg::class.java)
            startActivity(intent)
        }
    }
}