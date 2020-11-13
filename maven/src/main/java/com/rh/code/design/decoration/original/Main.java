package com.rh.code.design.decoration.original;

/**
 * 气象站
 * 原始代码实现
 */
class Main {

    // 实例变量声明
    private Display currentConditionsDisplay;
    private Display statisticsDisplay;
    private Display forecastDisplay;

    /**
     * 气象状态改变时, 会被调用的方法
     */
    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

    // 其他的方法
    private float getPressure() { return 0; }
    private float getHumidity() { return 0; }
    private float getTemperature() { return 0; }

    /**
     * 思考:
     * 19-21, 针对具体实现编程, 当以后如果要增加删除布告栏时, 必须修改程序
     * 改变的地方需要封装起来
     */
}
