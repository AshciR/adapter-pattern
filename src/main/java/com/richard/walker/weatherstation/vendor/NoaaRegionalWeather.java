package com.richard.walker.weatherstation.vendor;

import com.richard.walker.weatherstation.domain.WeatherStation;

/**
 * Data from weather stations are returned in an Array.
 */
public interface NoaaRegionalWeather {
    public WeatherStation[] getWeatherStations();
}
