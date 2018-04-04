package weatherstation.vendor;

import com.richard.walker.weatherstation.domain.WeatherStation;
import weatherstation.utilities.WeatherGenerator;

import java.util.Arrays;
import java.util.List;

import static weatherstation.constants.Cities.EAST_COAST_CITIES;

public class StandardRegionalWeatherImpl implements StandardRegionalWeather {

    @Override
    public List<WeatherStation> getWeatherStations() {
        return Arrays.asList(WeatherGenerator.generateWeatherDataFor(EAST_COAST_CITIES));
    }
}
