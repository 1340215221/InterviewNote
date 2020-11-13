package com.rh.code.design.factory.orginal3;

/**
 * 纽约风味披萨工厂
 */
class NYPizzaFactory extends SimplePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        // todo 自定义实现 纽约风味披萨
        return super.createPizza(type);
    }

    public static class NYVeggiePizza extends VeggiePizza {}
}
