package com.rh.code.design.decoration.customize;

/**
 * 主题
 */
public interface Subject {
    /**
     * 注册观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者, 当主题状态发生改变时
     */
    void notifyObservers();
}
