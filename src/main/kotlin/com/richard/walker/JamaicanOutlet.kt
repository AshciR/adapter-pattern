package com.richard.walker.outlets.kotlin

private const val WORKING_VOLTAGE = 110.0
private const val isVoltageAcceptable = WORKING_VOLTAGE >= WORKING_VOLTAGE * .90

class JamaicanOutlet : NorthAmericanOutlet {
    override fun provide110Volts(): Double {
        println("Jamaican outlet providing $WORKING_VOLTAGE V of power!")
        return WORKING_VOLTAGE
    }

    override fun isFunctioning(): Boolean = when (isVoltageAcceptable) {
        true -> {
            println("Jamaican outlet is working")
            isVoltageAcceptable
        }
        false -> {
            println("Jamaican outlet is not working")
            isVoltageAcceptable
        }
    }
}