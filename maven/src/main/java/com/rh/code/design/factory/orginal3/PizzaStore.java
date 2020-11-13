package com.rh.code.design.factory.orginal3;

/**
 * 披萨店
 */
class PizzaStore {

    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        // 通过工厂创建披萨
        // 披萨店不再需要了解披萨的具体类型
        Pizza pizza = factory.createPizza(type);
        // 加工
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
