package com.richard.walker.outlets.kotlin

private const val WORKING_VOLTAGE = 110.0

class JamaicanOutlet: NorthAmericanOutlet {
    override fun provide110Volts(): Double {
        println("Jamaican outlet providing $WORKING_VOLTAGE V of power!")
        return WORKING_VOLTAGE
    }

    override fun isFunctioning(): Boolean {
        val isVoltageAcceptable = WORKING_VOLTAGE >= WORKING_VOLTAGE * .90

        if (isVoltageAcceptable)
            println("British outlet is working")
        else
            println("British outlet is not working")

        return isVoltageAcceptable
    }

}