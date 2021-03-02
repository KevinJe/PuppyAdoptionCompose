package com.example.androiddevchallenge

import android.os.Build
import android.view.View
import android.view.WindowInsetsController
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.doOnLayout

open class BaseActivity : AppCompatActivity() {

    /**
     * Make status bar always be light mode.
     */
    @Suppress("DEPRECATION")
    protected fun setStatusBarToLight() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.decorView.doOnLayout {
                it.windowInsetsController?.setSystemBarsAppearance(
                    WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
                    WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
                )
            }
        } else {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
    }
}