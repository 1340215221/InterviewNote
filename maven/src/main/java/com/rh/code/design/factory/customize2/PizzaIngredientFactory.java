package com.rh.code.design.factory.customize2;

/**
 * 披萨原料工厂 接口
 */
interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();

    interface Dough {}

    interface Sauce {}

    interface Cheese {}

    interface Veggies {}

    interface Pepperoni {}

    interface Clams {}
}
