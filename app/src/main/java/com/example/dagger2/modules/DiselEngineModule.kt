package com.example.dagger2.modules

import com.example.dagger2.classes.DiselEngine
import com.example.dagger2.interfaces.Engine
import dagger.Module
import dagger.Provides

@Module
 class DiselEngineModule {
    private var horsePower : Int

    constructor(horsePower: Int) {
        this.horsePower = horsePower
    }

    @Provides
    fun provideHorsePower():Int{
        return horsePower
    }

    @Provides
     fun provideEngine(engine : DiselEngine):Engine{
         return engine
     }
}