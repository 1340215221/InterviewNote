package com.rh.code.design.factory.customize2;

/**
 * 披萨店 接口
 */
abstract class PizzaStore {

    /**
     * 生产披萨
     */
    protected abstract Pizza createPizza(String item);

}
