package com.dutradevs.helloapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHello = findViewById<Button>(R.id.btn_say_hello)
        val etName = findViewById<EditText>(R.id.et_hello)

        btnHello.setOnClickListener {
            val name = etName.text.toString()

            if(name.isNotEmpty()) {
                val intent = Intent(this, HelloActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }

        }
    }
}