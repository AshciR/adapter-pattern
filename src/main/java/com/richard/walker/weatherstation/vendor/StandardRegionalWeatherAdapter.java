package com.richard.walker.weatherstation.vendor;


import com.richard.walker.weatherstation.domain.WeatherStation;

import java.util.List;

public class StandardRegionalWeatherAdapter implements StandardRegionalWeather {

    // The Noaa Weather that needs to be converted to a Standard Regional Weather
    private NoaaRegionalWeather noaaRegionalWeather;

    // Note that the constructor takes a NoaaRegionalWeather Interface as a type
    // This is an example of using Dependency Injection b/c we provide the class
    // with all the dependencies that it needs.
    public StandardRegionalWeatherAdapter(NoaaRegionalWeather noaaRegionalWeather) {
        this.noaaRegionalWeather = noaaRegionalWeather;
    }

    @Override
    public List<WeatherStation> getWeatherStations() {
        // TODO: The standard API expects a List but the NOAA provides an Array.
        // Convert the Array to a List
        return null;
    }
}
