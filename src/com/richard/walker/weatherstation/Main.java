package com.richard.walker.weatherstation;

import com.richard.walker.weatherstation.domain.WeatherStation;
import com.richard.walker.weatherstation.vendor.NoaaRegionalWeather;
import com.richard.walker.weatherstation.vendor.NoaaRegionalWeatherImpl;

public class Main {

    public static void main(String[] args) {
        NoaaRegionalWeather noaaRegionalWeather = new NoaaRegionalWeatherImpl();

        System.out.printf("%20s | %6s | %7s | %8s\n", "City", "Temp", "Wind", "Humidity");
        for (WeatherStation station: noaaRegionalWeather.getWeatherStations()) {

            System.out.println("     ---------------------------------------------");
            System.out.println(station);
        }
        System.out.println("     ---------------------------------------------");
    }
}
