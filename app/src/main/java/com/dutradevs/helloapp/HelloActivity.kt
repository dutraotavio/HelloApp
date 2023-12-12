package com.dutradevs.helloapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.dutradevs.helloapp.databinding.ActivityHelloBinding
import com.dutradevs.helloapp.databinding.ActivityMainBinding

class HelloActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHelloBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelloBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tvHello = binding.tvHello
        val name = intent.extras?.getString("EXTRA_NAME").orEmpty()
        "Hello $name! \nNice to meet you!".also { tvHello.text = it }
    }
}