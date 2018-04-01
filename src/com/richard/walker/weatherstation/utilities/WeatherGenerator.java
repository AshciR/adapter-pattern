package com.richard.walker.weatherstation.utilities;

import com.richard.walker.weatherstation.constants.Cities;
import com.richard.walker.weatherstation.domain.WeatherStation;

import java.util.concurrent.ThreadLocalRandom;

public final class WeatherGenerator {
    private static final int MAX_TEMP = 110;
    private static final int MIN_TEMP = 20;
    private static final int MAX_WIND_SPEED = 50;
    private static final int MAX_HUMIDITY = 100;

    public static WeatherStation[] generateMockWeatherData() {
        int numCities = Cities.EAST_COAST_CITIES.length;

        WeatherStation[] weatherStations = new WeatherStation[numCities];
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        for (int i = 0; i < numCities; i++) {
            int temp = rand.nextInt(MIN_TEMP, MAX_TEMP);
            int windSpeed = rand.nextInt(MAX_WIND_SPEED);
            int humidity = rand.nextInt(MAX_HUMIDITY);
            String city = Cities.EAST_COAST_CITIES[i];

            WeatherStation station = new WeatherStation(temp, windSpeed, humidity, city);
            weatherStations[i] = station;
        }

        return weatherStations;
    }

    public WeatherGenerator() {
        throw new UnsupportedOperationException("Constructor not implemented");
    }
}
