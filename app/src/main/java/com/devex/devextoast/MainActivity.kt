package com.devex.devextoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devex.devextoast.DevExToast.showToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast(this@MainActivity,"My Lib",false)
    }
}