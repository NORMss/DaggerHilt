package com.norm.mydaggerhilt

import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

@ActivityScoped
class WiFiManager @Inject constructor(private val settings: WiFiSettings) {
    fun connection() {
        settings.openConnection()
    }

    fun sendMessage() {
        settings.writeBites()
    }
}

class WiFiSettings @Inject constructor() {
    fun openConnection() {
        Log.d("MyLog", "Connected")
    }

    fun writeBites() {
        Log.d("MyLog", "Hello")
    }
}