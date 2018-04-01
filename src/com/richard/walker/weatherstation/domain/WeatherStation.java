package com.richard.walker.weatherstation.domain;

public class WeatherStation {
    private int temperature;
    private int windSpeed;
    private int humidity;
    private String city;

    public WeatherStation(int temperature, int windSpeed, int humidity, String city) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.humidity = humidity;
        this.city = city;
    }

    public WeatherStation(String city) {
        temperature = 0;
        windSpeed = 0;
        humidity = 0;
        this.city = city;

    }


    public int getTemperature() {
        return temperature;
    }


    public int getWindSpeed() {
        return windSpeed;
    }


    public int getHumidity() {
        return humidity;
    }


    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return String.format("%20s | %5dF | %4dMPH | %4d%%", city, temperature, windSpeed, humidity);
    }
}
