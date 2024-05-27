package org.example.observer.weather3;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // 모든 옵저버에게 상태 변화를 알려줌
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            // 옵저버의 update를 인자 없이 호출하도록 수정
            observer.update();
        }
    }

    // 측정값이 갱신되면 옵저버들의 상태변화를 알려주는 메서드를 호출
    public void measurementsChanged() {
        notifyObservers();
    }

    // 편의상 setter 메서드로 측정값 세팅하면서 measurementsChanged 메서드 호출
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // getter 메서드 추가
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
