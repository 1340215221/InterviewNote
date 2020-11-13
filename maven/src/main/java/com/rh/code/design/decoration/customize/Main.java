package com.rh.code.design.decoration.customize;

/**
 * 自定义观察者接口, 实现观察者模式
 * 例子: 气象站
 */
public class Main {

    public static void main(String[] args) {
        // 创建主题
        WeatherData weatherData = new WeatherData();
        // 创建观察者
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        // 模拟生成数据
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

    /**
     * 思考:
     * 1. 推送的方式
     * 方便观察者从一次通知中获取所有数据
     *
     * 如果观察者只需要一点点数据, 却被强制接收大量的数据.
     * 让观察者订阅自己需要的数据, 如果主题增加状态时不会直接影响所有的观察者
     */

}
