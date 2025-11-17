package com.example.booknest

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Setting : AppCompatActivity() {

    private lateinit var movebackiconsetting:ImageView;
    private lateinit var movebacktosignin:ImageView;
    private lateinit var movetoeditpro:TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        movebackiconsetting = findViewById(R.id.settingbacktopro)
        movebackiconsetting.setOnClickListener {
            val intent = Intent(this,Profile::class.java)
            startActivity(intent)
        }

        movebacktosignin = findViewById(R.id.logoutbtn)
        movebacktosignin.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }

        movetoeditpro = findViewById(R.id.Editpro)
        movetoeditpro.setOnClickListener {
            val intent = Intent(this,EditProfile::class.java)
            startActivity(intent)
        }

    }
}