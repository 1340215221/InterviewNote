package com.rh.code.design.factory.customize;

/**
 * 披萨店
 * 工厂方法, 对具体披萨类的关联由子类决定和依赖
 * 在父类中, 只定义具体的流程, 具体不同的部分推到子类中实现
 */
abstract class PizzaStore {

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
     * 方法工厂
     * todo 实例化披萨的职责被移动到了一个方法中, 这个方法就如同给一个工厂
     */
    protected abstract Pizza createPizza(String type);

}
