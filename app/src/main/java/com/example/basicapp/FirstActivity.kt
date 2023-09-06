package com.example.basicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        val btnFirst = findViewById<AppCompatButton>(R.id.btnFirst)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        btnFirst.setOnClickListener {
            val name = etName.text.toString()

            if (name.isNotEmpty()) {
                val intent = Intent(this, GreetingActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)

            }
        }
    }
}