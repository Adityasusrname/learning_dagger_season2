package com.example.dagger2.classes



import android.util.Log
import com.example.dagger2.interfaces.Engine
import com.example.dagger2.outside_classes.Wheels
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Car @Inject constructor(
    private val engine : Engine,
    private val wheels : Wheels,

    ) {

    private var x : Int = 0


    fun drive(){
        engine.start()
        Log.i("Inside function drive","Hello there!")
        x++
        Log.i("Inside function drive","The value of x is $x")
    }

    @Inject fun enableRemote(remote: Remote){
        remote.setListener(this)
    }
}