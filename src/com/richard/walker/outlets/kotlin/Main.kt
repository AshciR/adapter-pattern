package com.richard.walker.outlets.kotlin

fun main(args: Array<String>) {
    val britishOutlet: EuropeanOutlet = BritishOutlet()
    val jamaicanOutlet: NorthAmericanOutlet = JamaicanOutlet()


    britishOutlet.isFunctioning()
    jamaicanOutlet.provide110Volts()
}