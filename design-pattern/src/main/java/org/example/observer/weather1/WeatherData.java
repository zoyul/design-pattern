package org.example.observer.weather1;

public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged() {

        // getter 메서드를 통해 최신 측정값을 가져옴
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        // 각 디스플레이 갱신
        // currentConditionDisplay.update(temp, humidity, pressure);
    }

    private float getTemperature() {
        return temperature;
    }

    private float getHumidity() {
        return humidity;
    }

    private float getPressure() {
        return pressure;
    }
}
