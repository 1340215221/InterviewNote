package com.rh.code.design.factory.orginal1;

/**
 * 订购披萨
 */
class Main {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("我收到一个" + pizza.getClass().getSimpleName());
    }

    /**
     * 存在的问题 :
     * {@link PizzaStore#orderPizza}方法中直接关联了具体披萨类型
     * 当添加新的披萨类型时, 需要修改该方法
     */

}