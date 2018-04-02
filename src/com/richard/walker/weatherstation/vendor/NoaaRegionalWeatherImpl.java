package com.richard.walker.weatherstation.vendor;

import com.richard.walker.weatherstation.domain.WeatherStation;
import com.richard.walker.weatherstation.utilities.WeatherGenerator;

import static com.richard.walker.weatherstation.constants.Cities.WEST_COAST_CITIES;

public class NoaaRegionalWeatherImpl implements NoaaRegionalWeather {
    private WeatherStation[] weatherStations;

    public NoaaRegionalWeatherImpl() {
        this.weatherStations = WeatherGenerator.generateWeatherDataFor(WEST_COAST_CITIES);
    }

    @Override
    public WeatherStation[] getWeatherStations() {
        return this.weatherStations;
    }

}
