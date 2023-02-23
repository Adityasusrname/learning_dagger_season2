package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2.classes.Car
import com.example.dagger2.interfaces.CarComponent
import com.example.dagger2.interfaces.DaggerCarComponent
import com.example.dagger2.modules.DiselEngineModule
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    lateinit var carComponent: CarComponent      //For constructor injection
    @Inject lateinit var globalCar: Car         //Example for field injection


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  carComponent = DaggerCarComponent.create() //Create disapper if any module uses constructor
        carComponent = DaggerCarComponent.builder().horsePower(100).engineCapacity(1400).build()
        val car: Car = carComponent.getCar()
        carComponent.inject(this)
        car.drive()
        globalCar.drive()

    }
}