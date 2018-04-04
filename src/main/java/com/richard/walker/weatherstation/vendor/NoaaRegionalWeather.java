package weatherstation.vendor;

import com.richard.walker.weatherstation.domain.WeatherStation;

public interface NoaaRegionalWeather {
    public WeatherStation[] getWeatherStations();
}
