package com.gramirez.intent2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alarmButton= findViewById<Button>(R.id.alarm)
        val linkButton = findViewById<Button>(R.id.webSearch)
        val contactButton = findViewById<Button>(R.id.goToWeb)

        alarmButton.setOnClickListener {
            val intent = Intent(this, AlarmaActivity::class.java)
            startActivity(intent)
        }

        linkButton.setOnClickListener {
            val intent = Intent(this, EnlaceActivity::class.java)
            startActivity(intent)
        }
        contactButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("content://contacts/people/")
            }
            startActivity(intent)
        }
    }
}