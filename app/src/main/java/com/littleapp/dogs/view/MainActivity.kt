package com.littleapp.dogs.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.littleapp.dogs.databinding.ActivityMainBinding
import com.littleapp.dogs.Unit.THEME

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        THEME.setThemeOfApp(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}