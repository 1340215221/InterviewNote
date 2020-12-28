package com.rh.code.design.factory.orginal1;

/**
 * 披萨店
 */
class PizzaStore {

    /**
     * 订购披萨
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        // 制作披萨 todo 这里是变化的部分
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }else if (type.equals("greek")) {
            pizza = new GreekPizza();
        }else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        // 加工
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
