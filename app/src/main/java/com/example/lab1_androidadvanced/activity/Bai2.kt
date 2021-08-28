package com.example.lab1_androidadvanced.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab1_androidadvanced.R
import com.example.lab1_androidadvanced.databinding.ActivityBai2Binding
import com.example.lab1_androidadvanced.service.ServiceBai2

class Bai2 : AppCompatActivity() {
    private lateinit var binding:ActivityBai2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBai2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBai2StartService.setOnClickListener {
            val intent = Intent(this, ServiceBai2::class.java)
            val bundle = Bundle()

            bundle.putString("name", "Nong Ngoc Dieu")
            bundle.putString("university", "FPT Polytechic")

            intent.putExtra("student", bundle)
            startService(intent)
        }

    }
}