package com.richard.walker.weatherstation;

import com.richard.walker.weatherstation.domain.WeatherStation;
import com.richard.walker.weatherstation.vendor.NoaaRegionalWeather;
import com.richard.walker.weatherstation.vendor.NoaaRegionalWeatherImpl;
import com.richard.walker.weatherstation.vendor.StandardRegionalWeather;
import com.richard.walker.weatherstation.vendor.StandardRegionalWeatherImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        StandardRegionalWeather regionalWeather = new StandardRegionalWeatherImpl();
        NoaaRegionalWeather noaaRegionalWeather = new NoaaRegionalWeatherImpl();


        printWeatherStationData(regionalWeather.getWeatherStations());
    }

    private static void printWeatherStationData(List<WeatherStation> weatherStations) {
        System.out.printf("%20s | %6s | %7s | %8s\n", "City", "Temp", "Wind", "Humidity");
        for (WeatherStation station: weatherStations) {

            System.out.println("     ---------------------------------------------");
            System.out.println(station);
        }
        System.out.println("     ---------------------------------------------");
    }
}
