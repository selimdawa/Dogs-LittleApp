package com.littleapp.dogs.view

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.littleapp.dogs.R
import com.littleapp.dogs.Unit.THEME

class MainActivity : AppCompatActivity() {

    var context: Context = this@MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        THEME.setThemeOfApp(context)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}