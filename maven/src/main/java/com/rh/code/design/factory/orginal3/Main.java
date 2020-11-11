package com.rh.code.design.factory.orginal3;

import com.rh.code.design.factory.orginal2.PizzaStore;

/**
 * 订购披萨
 * 让不同的店铺生产自己口味的披萨
 */
public class Main {

    /**
     * 订购不同风味的披萨
     */
    public static void main(String[] args) {
        // 订购纽约风味的披萨
        NYPizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyFactory);
        nyStore.orderPizza("Veggie");

        // 订购芝加哥风味的披萨
        ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(chicagoFactory);
        chicagoStore.orderPizza("Veggie");
    }

}
