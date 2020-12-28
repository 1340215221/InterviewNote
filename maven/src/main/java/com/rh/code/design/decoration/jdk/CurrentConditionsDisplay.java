package com.rh.code.design.decoration.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 当前天气状态布告栏
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    /**
     * 主题
     */
    Observable observable;
    /**
     * 天气数据
     */
    private float temperature;
    private float humidity;

    /**
     * 构造方法中, 关联主题, 并订阅主题
     */
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     * 拉取数据
     * @param obs 在接收通知时, 可以知道是那个主题发来的
     * @param arg 主题通知时, 传递的数据
     */
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("当前状态: " + temperature
                + "F 度, " + humidity + "% 湿度");
    }
}
