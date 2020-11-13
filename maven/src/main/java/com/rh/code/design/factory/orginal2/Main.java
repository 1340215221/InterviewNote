package com.rh.code.design.factory.orginal2;

/**
 * 订购披萨
 *
 * 设计原则 :
 * 将容易变化的部分抽取出来
 */
class Main {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("我收到一个" + pizza.getClass().getSimpleName());
    }

    /**
     * 变化部分 :
     * 将{@link PizzaStore#orderPizza}中生成不同类型披萨的操作, 抽取到简单工厂{@link SimplePizzaFactory}中
     * {@link PizzaStore#orderPizza}也只依赖简单工厂{@link SimplePizzaFactory}, 而不依赖具体的{@link Pizza}实现
     */

    /**
     * 问题 :
     */

}
