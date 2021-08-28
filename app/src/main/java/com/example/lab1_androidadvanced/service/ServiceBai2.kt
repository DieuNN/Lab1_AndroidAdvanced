package com.example.lab1_androidadvanced.service

import android.app.Service
import android.content.Intent
import android.os.Bundle
import android.os.IBinder
import android.widget.Toast

class ServiceBai2 : Service() {

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        val bundle = intent.getBundleExtra("student")
        Toast.makeText(applicationContext, "Information: Name:${bundle!!.getString("name")}, University:${bundle.getString("university")}", Toast.LENGTH_SHORT).show()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onCreate() {
        super.onCreate()
    }

}