package com.rh.code.design.decoration.customize;

/**
 * 当前天气状态布告栏
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    /**
     * 天气数据
     */
    private float temperature;
    private float humidity;
    /**
     * 观察者
     * 便于于订阅和取消订阅
     */
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display(); // todo 更新数据后, 调用显示, 这是合理的. 确实还有更好的方式显示数据 mvc模式
    }

    @Override
    public void display() {
        System.out.println("当前状态: " + temperature
                + "F 度, " + humidity + "% 湿度");
    }
}
