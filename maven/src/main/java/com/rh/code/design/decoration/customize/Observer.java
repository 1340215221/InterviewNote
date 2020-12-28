package com.rh.code.design.decoration.customize;

/**
 * 观察者 接口
 * tip 气象站
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);

}
