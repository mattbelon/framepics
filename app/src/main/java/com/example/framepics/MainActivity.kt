package com.example.framepics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPic = findViewById<Button>(R.id.button)

        btnPic.setOnClickListener {
            val myIntent = Intent(this, AppScanActivity::class.java)
            startActivity(myIntent)
        }

    }
}