package com.rh.code.design.factory.customize2;

/**
 * 纽约披萨店
 *
 * 创建披萨时, 给披萨实例传入一个原料工厂
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (item.equals("clam")) {
            //todo
        }
        return pizza;
    }

}
