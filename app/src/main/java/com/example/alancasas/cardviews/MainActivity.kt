package com.example.alancasas.cardviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView : TextView = findViewById(R.id.info_text)
        textView.text = "Vamos con los camaleonesr"
    }
}
