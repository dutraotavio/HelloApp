package com.dutradevs.helloapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        val tvHello = findViewById<TextView>(R.id.tv_hello)
        val name = intent.extras?.getString("EXTRA_NAME").orEmpty()
        "Hello $name! \nNice to meet you!".also { tvHello.text = it }
    }
}