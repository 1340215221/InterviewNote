package com.rh.code.design.decoration.customize;

import java.util.ArrayList;

/**
 * 气象台
 * 主题
 */
public class WeatherData implements Subject {

    /**
     * 记录观察者
     */
    private ArrayList<Observer> observers;
    /**
     * 天气数据
     */
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(temperature, humidity, pressure));
    }

    /**
     * 供数据提供方调用的 通知改变方法
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 模拟生成新数据
     * 测试方法
     */
    public void setMeasurements(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
