package com.example.projectmp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    lateinit var RegBtn : Button
    lateinit var LogBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        RegBtn = findViewById(R.id.button2)
        RegBtn.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        LogBtn = findViewById(R.id.button)
        LogBtn.setOnClickListener{
            val intent = Intent(this,Register::class.java)
            startActivity(intent)
        }
    }
}