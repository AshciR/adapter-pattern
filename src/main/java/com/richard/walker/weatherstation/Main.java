package com.richard.walker.weatherstation;


import com.richard.walker.weatherstation.domain.WeatherStation;
import com.richard.walker.weatherstation.region.NoaaToStandardRegionalWeatherAdapter;
import com.richard.walker.weatherstation.region.StandardRegionalWeather;
import com.richard.walker.weatherstation.region.StandardRegionalWeatherImpl;
import com.richard.walker.weatherstation.vendor.*;

import java.util.List;

import static com.richard.walker.weatherstation.constants.Cities.EAST_COAST_CITIES;
import static com.richard.walker.weatherstation.constants.Cities.WEST_COAST_CITIES;

public class Main {

    public static void main(String[] args) {
        StandardRegionalWeather eastCoastWeather = new StandardRegionalWeatherImpl(EAST_COAST_CITIES);
        NoaaRegionalWeather westCoastWeather = new NoaaRegionalWeatherImpl(WEST_COAST_CITIES);

        StandardRegionalWeather regionalWeatherAdapter = new NoaaToStandardRegionalWeatherAdapter(westCoastWeather);

        printWeatherStationData(eastCoastWeather.getWeatherStations());
        printWeatherStationData(regionalWeatherAdapter.getWeatherStations());
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
