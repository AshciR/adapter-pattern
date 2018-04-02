package com.richard.walker.weatherstation.vendor;

import com.richard.walker.weatherstation.domain.WeatherStation;

import java.util.List;

public class StandardRegionalWeatherAdapter implements StandardRegionalWeather {

    NoaaRegionalWeather noaaRegionalWeather;

    public StandardRegionalWeatherAdapter(NoaaRegionalWeather noaaRegionalWeather) {
        this.noaaRegionalWeather = noaaRegionalWeather;
    }

    @Override
    public List<WeatherStation> getWeatherStations() {
        // TODO: The standard API expects a List but the NOAA provides an Array. Convert the Array to a List

        return null;
    }
}
