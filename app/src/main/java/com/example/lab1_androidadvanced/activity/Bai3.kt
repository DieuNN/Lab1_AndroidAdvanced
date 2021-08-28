package com.example.lab1_androidadvanced.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lab1_androidadvanced.R
import com.example.lab1_androidadvanced.databinding.ActivityBai3Binding
import com.example.lab1_androidadvanced.service.ServiceBai3

class Bai3 : AppCompatActivity() {
    private lateinit var binding:ActivityBai3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBai3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBai3StartService.setOnClickListener {
            val intent = Intent(this, ServiceBai3::class.java)
            val bundle = Bundle()



            if (binding.edtBai3String.text!!.isEmpty() || binding.edtBai3Character.text!!.isEmpty()) {
                Toast.makeText(this, "Are you forget to enter all the text fields?", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            bundle.putString("character", binding.edtBai3Character.text.toString())
            bundle.putString("text", binding.edtBai3String.text.toString())
            intent.putExtra("bundle", bundle)

            startService(intent)
        }


    }
}