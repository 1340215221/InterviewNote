package com.rh.code.design.decoration.original;

/**
 * 展示面板
 */
public interface Display {
    /**
     * 更新内容
     */
    void update(float temp, float humidity, float pressure);

    /**
     * 展示内容
     */
    String show();
}
