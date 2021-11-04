package com.example.projectmp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ComicDetail : AppCompatActivity() {
    lateinit var chapter1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.manga_detail)
        chapter1 = findViewById(R.id.textView7)
        chapter1.setOnClickListener{
            val intent = Intent(this,ActivityChapter::class.java)
            startActivity(intent)
        }

    }
}