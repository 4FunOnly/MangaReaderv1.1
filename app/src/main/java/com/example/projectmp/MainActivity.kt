package com.example.projectmp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var comic1 : ImageButton
    lateinit var accbtn : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        comic1 = findViewById<ImageButton>(R.id.imageButton3)
        comic1.setOnClickListener{
            val intent = Intent(this,ComicDetail::class.java)
            startActivity(intent)
        }
        accbtn = findViewById(R.id.imageButton6)
        accbtn.setOnClickListener{
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }

    }
}