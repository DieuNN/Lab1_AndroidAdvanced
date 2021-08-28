package com.example.lab1_androidadvanced.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab1_androidadvanced.R
import com.example.lab1_androidadvanced.databinding.ActivityBai1Binding
import com.example.lab1_androidadvanced.service.ServiceBai1

class Bai1 : AppCompatActivity() {
    private lateinit var binding: ActivityBai1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBai1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBai1StartService.setOnClickListener {
            startService(Intent(this, ServiceBai1::class.java))
        }

        binding.btnBai1StopService.setOnClickListener {
            stopService(Intent(this, ServiceBai1::class.java))
        }
    }
}