package com.example.projectmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView


class ActivityChapter : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chapter)
        lateinit var pdfview : PDFView

        pdfview = findViewById(R.id.pdfview)
        pdfview.fromAsset("chapter1.pdf").load()

    }


}