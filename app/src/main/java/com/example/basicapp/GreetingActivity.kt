package com.example.basicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
        val tvGreeting = findViewById<TextView>(R.id.tvGreeting)
        val name = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvGreeting.text = "Hola $name"
    }
}