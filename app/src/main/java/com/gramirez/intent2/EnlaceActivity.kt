package com.gramirez.intent2

import android.app.SearchManager
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EnlaceActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.enlace_activity)

        val buttonUrl = findViewById<Button>(R.id.urlClicker)

        buttonUrl.setOnClickListener {
            val urlData = findViewById<TextView>(R.id.urlSearch)
            val urlText = urlData.text.toString()

            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, urlText)
            }
            startActivity(intent)
            finish()
        }
    }

}
