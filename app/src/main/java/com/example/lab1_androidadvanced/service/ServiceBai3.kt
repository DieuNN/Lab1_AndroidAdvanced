package com.example.lab1_androidadvanced.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class ServiceBai3 : Service() {

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        val bundle = intent.getBundleExtra("bundle")
        val text = bundle!!.getString("text")
        val charArr = text!!.toCharArray()
        val char = bundle.getString("character")
        var count  = 0

        for(element in charArr) {
            if (element.lowercase() == char) {
                count++
            }
        }

        if (count == 0) {
            Toast.makeText(applicationContext, "No \"$char\" found!", Toast.LENGTH_SHORT).show()
        } else  {
            Toast.makeText(applicationContext, "There are $count \"$char\" characters in given string ", Toast.LENGTH_SHORT).show()
        }

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onCreate() {
        super.onCreate()
    }
}