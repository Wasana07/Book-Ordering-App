package com.example.booknest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.booknest.Profile

class EditProfile : AppCompatActivity() {

    private lateinit var calcelandmoveprofile: ImageView
    private lateinit var saveandmoveprofile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edit_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        calcelandmoveprofile = findViewById(R.id.calceledit)
        calcelandmoveprofile.setOnClickListener{
            val intent = Intent(this, Profile::class.java);
            startActivity(intent)
        }

        saveandmoveprofile = findViewById(R.id.saveandmoveprofile)
        saveandmoveprofile.setOnClickListener{
            val intent = Intent(this, Profile::class.java);
            startActivity(intent)
        }

    }
}