package com.example.dagger2.classes

import android.util.Log
import com.example.dagger2.interfaces.Engine
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine : Engine{
    private var horsePower : Int
    private var engineCapacity : Int

    @Inject
    constructor(@Named("horse power") horsePower: Int, @Named("engine capacity") engineCapacity:Int) {
        this.horsePower = horsePower
        this.engineCapacity = engineCapacity
    }



    override fun start(){
        Log.i("Inside function start","Petrol Engine started! Horsepower : $horsePower \n Engine capacity : $engineCapacity")
    }
}