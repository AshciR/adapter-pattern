package com.richard.walker.weatherstation.vendor;

import com.richard.walker.weatherstation.domain.WeatherStation;
import com.richard.walker.weatherstation.utilities.WeatherGenerator;

import java.util.Arrays;
import java.util.List;

public class StandardRegionalWeatherImpl implements StandardRegionalWeather {
    private List<WeatherStation> stations;

    public StandardRegionalWeatherImpl(String[] citiesInRegion) {
        stations = Arrays.asList(WeatherGenerator.generateWeatherDataFor(citiesInRegion));
    }

    @Override
    public List<WeatherStation> getWeatherStations() {
        return stations;
    }
}
