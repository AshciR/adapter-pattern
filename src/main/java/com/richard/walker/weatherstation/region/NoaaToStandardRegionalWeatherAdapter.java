package com.richard.walker.weatherstation.region;


import com.richard.walker.weatherstation.domain.WeatherStation;
import com.richard.walker.weatherstation.region.StandardRegionalWeather;
import com.richard.walker.weatherstation.vendor.NoaaRegionalWeather;

import java.util.List;

public class NoaaToStandardRegionalWeatherAdapter implements StandardRegionalWeather {

    // The Noaa Weather that needs to be converted to a Standard Regional Weather
    private NoaaRegionalWeather noaaRegionalWeather;

    // Note that the constructor takes a NoaaRegionalWeather Interface as a type
    // This is an example of using Dependency Injection b/c we provide the class
    // with all the dependencies that it needs.
    public NoaaToStandardRegionalWeatherAdapter(NoaaRegionalWeather noaaRegionalWeather) {
        this.noaaRegionalWeather = noaaRegionalWeather;
    }

    @Override
    public List<WeatherStation> getWeatherStations() {
        // TODO: The standard API expects a List but the NOAA provides an Array. Convert the Array to a List.

        // The Arrays collection class already has an implementation:
        // https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
        return null;
    }
}
