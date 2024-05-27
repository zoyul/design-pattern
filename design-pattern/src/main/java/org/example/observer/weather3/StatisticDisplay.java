package org.example.observer.weather3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatisticDisplay implements Observer, DisplayElement {

    private List<Float> temperaturesList = new ArrayList<>();
    private List<Float> humidityList = new ArrayList<>();
    private List<Float> pressureList = new ArrayList<>();
    private WeatherData weatherData;

    public StatisticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("최고/최저 온도 = " + Collections.max(temperaturesList) + "/" + Collections.min(temperaturesList));
    }

    @Override
    public void update() {
        this.temperaturesList.add(weatherData.getTemperature());
        this.humidityList.add(weatherData.getHumidity());
        this.pressureList.add(weatherData.getPressure());
        display();
    }
}
