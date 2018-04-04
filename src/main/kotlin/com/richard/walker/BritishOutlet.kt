package com.richard.walker.outlets.kotlin

private const val WORKING_VOLTAGE = 220.0
private const val isVoltageAcceptable = WORKING_VOLTAGE >= WORKING_VOLTAGE * .90

class BritishOutlet : EuropeanOutlet {
    override fun provide220Volts(): Double {
        println("British outlet is providing $WORKING_VOLTAGE V of power!")
        return WORKING_VOLTAGE
    }

    override fun isFunctioning(): Boolean = when (isVoltageAcceptable) {
        true -> {
            println("British outlet is working")
            isVoltageAcceptable
        }
        false -> {
            println("British outlet is not working")
            isVoltageAcceptable
        }
    }
}