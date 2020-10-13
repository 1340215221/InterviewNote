package com.rh.code.design.decoration.jdk;

import java.util.Observable;

/**
 * 主题
 */
public class WeatherData extends Observable {
    /**
     * 天气数据
     */
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        // 在调用notifyObservers前, 先调用setChanged来指示状态已经改变
        setChanged();
        // notifyObservers只在change == true时才通知观察者, 在通知后会将change改为false
        // 方式一, 通知时没有传递数据, 说明我们采用了拉取数据的方式
        notifyObservers();
        // 方式二, 通知时传递数据, 推送数据方式
//        notifyObservers(args);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * 提供get方法用于 观察者拉取
     */
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
