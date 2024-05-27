package org.example.observer.weather3;

public class Weather2Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        weatherData.setMeasurements(10, 10, 10);
        weatherData.setMeasurements(20, 20, 20);
        weatherData.setMeasurements(5, 5, 5);

    }
}
