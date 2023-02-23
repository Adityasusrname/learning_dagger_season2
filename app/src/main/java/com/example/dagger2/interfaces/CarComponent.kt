package com.example.dagger2.interfaces

import com.example.dagger2.classes.Car
import com.example.dagger2.MainActivity
import com.example.dagger2.modules.DiselEngineModule
import com.example.dagger2.modules.PetrolEngineModule
import com.example.dagger2.modules.WheelsModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelsModule::class,PetrolEngineModule::class])
interface CarComponent {
    fun getCar() : Car
    fun inject(mainActivity: MainActivity)
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun horsePower(@Named("horse power") horsePower:Int) : Builder
        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity:Int) : Builder
        fun build() : CarComponent
    }
}