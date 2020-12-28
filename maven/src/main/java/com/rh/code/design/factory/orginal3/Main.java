package com.rh.code.design.factory.orginal3;

/**
 * 订购披萨
 * 让不同的店铺生产自己口味的披萨
 *
 * 增加需求 :
 * 不同地方的店铺能做出来具有当地风味特色的披萨
 */
class Main {

    /**
     * 订购不同风味的披萨
     */
    public static void main(String[] args) {
        // 订购纽约风味的披萨
        NYPizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyFactory);
        Pizza nyVeggie = nyStore.orderPizza("veggie");
        System.out.println("我收到一个" + nyVeggie.getClass().getSimpleName());

        // 订购芝加哥风味的披萨
        ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(chicagoFactory);
        Pizza cVeggie = chicagoStore.orderPizza("veggie");
        System.out.println("我收到一个" + cVeggie.getClass().getSimpleName());
    }


    /**
     * 变化部分 :
     * 对简单工厂{@link SimplePizzaFactory}进行继承
     * 在实现类中重写了生成披萨{@link NYPizzaFactory#createPizza}方法
     * 返回了具有自己独特风味的披萨{@link NYPizzaFactory.NYVeggiePizza}
     */

}
