package com.network.utils

import android.graphics.Color
import android.view.View
import android.view.Window
import android.view.WindowManager

class GlobalClass {
    companion object {

        fun updateStatusBar(window: Window?) {
            window?.apply {
                clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                statusBarColor = Color.TRANSPARENT
            }
        }
    }
}