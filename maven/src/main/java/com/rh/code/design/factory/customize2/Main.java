package com.rh.code.design.factory.customize2;

import com.alibaba.fastjson.JSONObject;

/**
 * 订购披萨--抽象工厂
 *
 * 新需求:
 * 制作披萨时, 可以根据地域不同使用不同的原料
 */
class Main {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza cheese = pizzaStore.orderPizza("cheese");
        System.out.println("我收到一个" + cheese.getClass().getSimpleName() + ", 原料: " + JSONObject.toJSONString(pizzaStore));
    }

    /**
     * 变化:
     */

}
