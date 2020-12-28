package com.rh.code.design.factory.orginal2;

/**
 * 披萨 简单工厂
 */
class SimplePizzaFactory {

    /**
     * 根据类型创建披萨对象
     * 该部分很可能增加修改披萨
     * 1. 抽取后便于复用
     * 2. 这里使用成员方法而不是静态方法, 可以通过继承改变方法行为, 更便于拓展
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }

}
