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
     * todo 实例化披萨的职责被移动到了一个方法中, 这个方法就如同给一个工厂
     */
    protected abstract Pizza createPizza(String type);

}
