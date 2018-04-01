package com.richard.walker.weatherstation.vendor;

import com.richard.walker.weatherstation.constants.Cities;
import com.richard.walker.weatherstation.domain.WeatherStation;
import com.richard.walker.weatherstation.utilities.WeatherGenerator;

public class NoaaRegionalWeatherImpl implements NoaaRegionalWeather {
    private WeatherStation[] weatherStations;

    public NoaaRegionalWeatherImpl() {
        this.weatherStations = WeatherGenerator.generateMockWeatherData();
    }

    @Override
    public WeatherStation[] getWeatherStations() {
        return this.weatherStations;
    }

}
