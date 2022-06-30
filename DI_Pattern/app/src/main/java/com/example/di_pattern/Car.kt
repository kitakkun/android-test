package com.example.di_pattern

class Engine {
    fun start() {
        print("started")
    }
}

class Car {
    // engine is created inner Car class.
    // THIS IS NOT "DEPENDENCY INJECTION"
    // There is a problem...
    // - we cannot use subclass of engine.
    // - if we want to make both Gas-powered car and Electric-powered car,
    //   we need to create two types of Car.
    private val engine = Engine()

    fun start() {
        engine.start()
    }
}

fun main() {
    val car = Car()
    car.start()
}