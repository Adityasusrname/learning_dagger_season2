package com.example.dagger2.modules

import com.example.dagger2.classes.PetrolEngine
import com.example.dagger2.interfaces.Engine
import dagger.Binds
import dagger.Module


@Module
 abstract class PetrolEngineModule {
    @Binds
   abstract fun bindsEngine(engine: PetrolEngine):Engine
}