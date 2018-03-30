package com.richard.walker.weatherstation.vendor;

import com.richard.walker.weatherstation.domain.WeatherStation;
import com.richard.walker.weatherstation.utilities.WeatherGenerator;

import java.util.Arrays;
import java.util.List;

public class StandardRegionalWeatherImpl  implements StandardRegionalWeather {

    @Override
    public List<WeatherStation> getWeatherStations() {
        return Arrays.asList(WeatherGenerator.generateMockWeatherData());
    }
}
