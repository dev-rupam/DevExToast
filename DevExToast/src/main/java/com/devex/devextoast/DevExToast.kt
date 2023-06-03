package com.devex.devextoast

import android.content.Context
import android.widget.Toast

object DevExToast {
    fun showToast(context: Context, message: String, isLong: Boolean) {
        val duration = if (isLong) Toast.LENGTH_LONG else Toast.LENGTH_SHORT
        Toast.makeText(context, message, duration).show()
    }
}