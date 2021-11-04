package com.example.projectmp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity(){
    lateinit var regBtn : Button
    lateinit var logBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        regBtn = findViewById(R.id.button2)
        regBtn.setOnClickListener{
            val intent = Intent(this,Register::class.java)
            startActivity(intent)
        }
        logBtn = findViewById(R.id.button)
        logBtn.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}