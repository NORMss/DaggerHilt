package com.norm.mydaggerhilt

import android.util.Log

class WiFiManager(private val settings: WiFiSettings) {
    fun connection() {
        settings.openConnection()
    }

    fun sendMessage() {
        settings.writeBites()
    }
}

class WiFiSettings {
    fun openConnection() {
        Log.d("MyLog", "Connected")
    }

    fun writeBites() {
        Log.d("MyLog", "Hello")
    }
}