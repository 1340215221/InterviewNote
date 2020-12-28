package com.rh.code.design.decoration.jdk;

/**
 * 使用jdk观察者接口, 实现观察者模式
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
     * 1. jdk的Observable是一个类, 主题必须继承Observable才能使用, 不能再对其他类的继承
     * 2. Observable.setChanged()是一个protected方法, 只能在子类中调用. 无法将Observable组合到自定义对象中来使用
     */

}
