package com.rh.code.design.factory.orginal3;

import com.rh.code.design.factory.orginal2.Pizza;
import com.rh.code.design.factory.orginal2.SimplePizzaFactory;

/**
 * 纽约风味披萨工厂
 */
public class NYPizzaFactory extends SimplePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        // todo 自定义实现 纽约风味披萨
        return super.createPizza(type);
    }
}
