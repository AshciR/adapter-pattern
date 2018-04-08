package com.richard.walker.weatherstation.vendor;


import com.richard.walker.weatherstation.domain.WeatherStation;

import java.util.List;

/**
 * Data from weather stations are returned in a List
 */
public interface StandardRegionalWeather {
    public List<WeatherStation> getWeatherStations();
}
