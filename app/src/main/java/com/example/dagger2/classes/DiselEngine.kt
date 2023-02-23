package com.example.dagger2.classes

import android.util.Log
import com.example.dagger2.interfaces.Engine
import javax.inject.Inject

class DiselEngine : Engine {

    private var horsePower:Int

    @Inject
     constructor(horsePower:Int){
        this.horsePower  = horsePower
    }

    override fun start(){
        Log.i("Inside function start","Disel engine started! Horsepower:$horsePower")
    }
}