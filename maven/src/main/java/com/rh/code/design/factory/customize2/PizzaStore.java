package com.rh.code.design.factory.customize2;

/**
 * 披萨店 接口
 */
abstract class PizzaStore {

    /**
     * 生产披萨
     */
    protected abstract Pizza createPizza(String item);

    /**
     * 订购披萨
     */
    public Pizza orderPizza(String item) {
        Pizza pizza = createPizza(item);
        if (pizza == null) {
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
