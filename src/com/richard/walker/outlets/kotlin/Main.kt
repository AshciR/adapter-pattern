package com.richard.walker.outlets.kotlin

fun main(args: Array<String>) {
    val britishOutlet: EuropeanOutlet = BritishOutlet()
    val northAmericanAdapter = NorthAmericanAdapter(britishOutlet)

    provideNorthAmericanElectricity(northAmericanAdapter)

}

private fun provideNorthAmericanElectricity(northAmericanOutlet: NorthAmericanOutlet) {
    if (northAmericanOutlet.isFunctioning()) {
        northAmericanOutlet.provide110Volts()
        println("Providing North American Electricity")
    } else {
        println("I don't have the power!")
    }

}