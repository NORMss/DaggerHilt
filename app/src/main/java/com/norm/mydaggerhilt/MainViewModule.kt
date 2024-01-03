package com.norm.mydaggerhilt

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModule @Inject constructor(
    val wifiManager: WiFiManager
) : ViewModel() {
    init {
        Log.d("MyLog", "MainViewModule instance id: $wifiManager")
    }

    fun connect() {
        wifiManager.connection()
    }
}