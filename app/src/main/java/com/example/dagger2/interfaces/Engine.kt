package com.example.dagger2.interfaces

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
interface Engine {
    fun start()
}