package com.norm.mydaggerhilt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.norm.mydaggerhilt.frags.Activity2
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var wifiManager: WiFiManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wifiManager.connection()
        wifiManager.sendMessage()

        Log.d("MyLog", "MainActivity instance id: $wifiManager")

        startActivities(arrayOf(Intent(this, Activity2::class.java)))
    }
}