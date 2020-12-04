package com.rh.code.design.factory.customize2;

import lombok.Getter;

import static com.rh.code.design.factory.customize2.PizzaIngredientFactory.*;

/**
 * 披萨 抽象
 *
 * 在成员变量中声明组成需要的原料
 */
@Getter
abstract class Pizza {
    /**
     * 披萨组成的原料
     */
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    /**
     * 准备
     * 在这里收集披萨原料
     */
    abstract void prepare();

    void bake() {}

    void cut() {}

    void box() {}

    void setName() {}

    // todo
    public String toString() { return ""; }
}
