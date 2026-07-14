package com.littleapp.dogs.utils

import android.app.Activity
import android.content.Context
import android.content.Intent

inline fun <reified T : Activity> Context.launchActivity(
    finishCaller: Boolean = false,
    noinline init: Intent.() -> Unit = {},
) {
    val intent = Intent(this, T::class.java)
    intent.init()
    startActivity(intent)
    if (finishCaller && (this is Activity)) {
        finish()
    }
}