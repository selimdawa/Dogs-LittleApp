package com.littleapp.dogs.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.littleapp.dogs.CLASS
import com.littleapp.dogs.Unit.THEME
import com.littleapp.dogs.Unit.VOID
import com.littleapp.dogs.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private var binding: ActivitySplashBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        THEME.setThemeOfApp(this)
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        Handler(Looper.getMainLooper()).postDelayed({ launch() }, TIME_FINAL)
    }

    private fun launch() {
        VOID.Intent1(this, CLASS.MAIN)
        finish()
    }

    companion object {
        private const val TIME_PER_SECOND = 2L
        private const val TIME_PER_MILLIS = 1000L
        const val TIME_FINAL = TIME_PER_MILLIS * TIME_PER_SECOND
    }
}