package com.example.di_pattern

class Engine {
    fun start() {
        print("started")
    }
}

// this is dependency injection(another approach)
class Car {
    lateinit var engine: Engine
    fun start() {
        engine.start()
    }
}

fun main() {
    val car = Car()
    car.engine = Engine()
    car.start()
}