package com.rh.code.design.observer.customize;

/**
 * 饮料 抽象类
 */
abstract class Beverage {

    protected String description = "Unknown Beverage";

    /**
     * 饮料描述
     */
    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
