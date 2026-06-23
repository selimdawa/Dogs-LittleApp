package com.littleapp.dogs.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.littleapp.dogs.R
import com.littleapp.dogs.Unit.THEME

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        THEME.setThemeOfApp(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}