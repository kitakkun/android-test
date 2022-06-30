package com.example.di_pattern

class Engine {
    fun start() {
        print("started")
    }
}

// this is dependency injection
class Car(private val engine: Engine) {
    fun start() {
        engine.start()
    }
}

fun main() {
    val engine = Engine()
    val car = Car(engine)
    car.start()
}