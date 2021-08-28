package com.example.lab1_androidadvanced.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class ServiceBai1 : Service() {

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onCreate() {
        Toast.makeText(applicationContext, "Service started!", Toast.LENGTH_SHORT).show()
        super.onCreate()
    }

    override fun onDestroy() {
        Toast.makeText(applicationContext, "Service stopped!", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }
}