package com.rh.code.design.factory.customize;

import com.rh.code.design.factory.orginal2.Pizza;

/**
 * 披萨店
 */
public abstract class PizzaStore {

    /**
     * 订购披萨
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        // 加工
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 制作披萨
     */
    protected abstract Pizza createPizza(String type);

}
