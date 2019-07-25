package com.zz.observer.v2;


public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 4.3f);
    }
}
