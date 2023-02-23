package com.example.dagger2.modules

import com.example.dagger2.outside_classes.Rims
import com.example.dagger2.outside_classes.Tires
import com.example.dagger2.outside_classes.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims():Rims{
        return Rims()
    }

    @Provides
    fun provideTires():Tires{
        val tires:Tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims,tires: Tires):Wheels{
        return Wheels(rims,tires)
    }

}