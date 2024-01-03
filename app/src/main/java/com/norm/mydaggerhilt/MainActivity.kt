package com.norm.mydaggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var wifiManager: WiFIManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settings = WiFiSettings()
        wifiManager = WiFIManager(settings)

        wifiManager.connection()
        wifiManager.sendMessage()
    }
}