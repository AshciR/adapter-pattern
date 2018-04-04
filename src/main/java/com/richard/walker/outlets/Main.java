package com.richard.walker.outlets;

public class Main {

    public static void main(String[] args) {

        // We got an European outlet that provides 220 V
        EuropeanOutlet britishOutlet = new BritishOutlet();
        NorthAmericanOutlet northAmericanAdapter = new NorthAmericanAdapter(britishOutlet);

        // Provides 110V, but we need to use an adapter to do it
        provideNorthAmericanElectricity(northAmericanAdapter);
    }

    private static void provideNorthAmericanElectricity(NorthAmericanOutlet naOutlet){
        if(naOutlet.isFunctioning()){
            naOutlet.provide110Volts();
            System.out.println("Providing North American Electricity.");
        } else {
            System.out.println("I don't have the power!!!");
        }
    }

}
