package com.example.dagger2.classes

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Remote @Inject constructor() {
    fun setListener(car:Car){
        Log.i("Inside setLIstener","Remote connected!")
        car.drive()
    }
}