package com.richard.walker.weatherstation.vendor;

import com.richard.walker.weatherstation.domain.WeatherStation;
import com.richard.walker.weatherstation.utilities.WeatherGenerator;

public class NoaaRegionalWeatherImpl implements NoaaRegionalWeather {
    private WeatherStation[] weatherStations;

    public NoaaRegionalWeatherImpl(String[] citiesInRegion) {
        this.weatherStations = WeatherGenerator.generateWeatherDataFor(citiesInRegion);
    }

    @Override
    public WeatherStation[] getWeatherStations() {
        return this.weatherStations;
    }

}
