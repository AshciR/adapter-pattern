package com.richard.walker;

public class NorthAmericanAdapter implements NorthAmericanOutlet{

    private EuropeanOutlet europeanOutlet;

    NorthAmericanAdapter(EuropeanOutlet europeanOutlet){
        this.europeanOutlet = europeanOutlet;
    }

    @Override
    public Double provide110Volts(){
        System.out.println("I converted from " + europeanOutlet.provide220Volts() + "V to 110V.");
        System.out.println("Adapter providing " + (europeanOutlet.provide220Volts() / 2) + "V of power!");
        return europeanOutlet.provide220Volts() / 2;
    }

    @Override
    public Boolean isFunctioning(){
        return europeanOutlet.isFunctioning();
    }
}
