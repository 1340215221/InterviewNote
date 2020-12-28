package com.rh.code.design.factory.customize2;

/**
 * 披萨实现
 *
 * 具体的披萨在创建时, 需要依赖一个原料工厂
 * 以在准备过程中, 收集原料
 */
public class CheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    /**
     * 创建披萨实例时, 需要依赖一个原料工厂
     * 保存在成员变量中
     */
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    /**
     * 准备
     *
     * 在准备过程中收集披萨组成需要的原料
     */
    @Override
    void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
