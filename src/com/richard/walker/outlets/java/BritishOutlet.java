package com.richard.walker.outlets.java;

public class BritishOutlet implements EuropeanOutlet{

    private static final double WORKING_VOLTAGE = 220.00;

    @Override
    public Double provide220Volts(){
        System.out.println("British Outlet providing " + WORKING_VOLTAGE + "V of power!");
        return WORKING_VOLTAGE;
    }

    @Override
    public Boolean isFunctioning(){
        System.out.println("British Outlet is working.");
        if(WORKING_VOLTAGE >= (WORKING_VOLTAGE * 0.90)){
            return Boolean.TRUE;
        } else{
            return Boolean.FALSE;
        }
    }
}
