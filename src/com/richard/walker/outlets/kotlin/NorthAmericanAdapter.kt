package com.richard.walker.outlets.kotlin

class NorthAmericanAdapter(private val europeanOutlet: EuropeanOutlet): NorthAmericanOutlet {

    override fun provide110Volts(): Double {
        println("I converted from  ${europeanOutlet.provide220Volts()}V to 110V.")
        println("Adapter providing ${europeanOutlet.provide220Volts() / 2}V of power!")
        return europeanOutlet.provide220Volts() / 2
    }

    override fun isFunctioning(): Boolean {
        return europeanOutlet.isFunctioning()
    }
}