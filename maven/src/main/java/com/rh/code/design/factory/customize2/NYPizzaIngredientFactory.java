package com.rh.code.design.factory.customize2;

/**
 * 纽约披萨原料工厂
 *
 * 返回纽约披萨的特殊原料配方
 */
class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    private class ThinCrustDough implements Dough {}

    private class Garlic implements Veggies {}

    private class Onion implements Veggies {}

    private class Mushroom implements Veggies {}

    private class RedPepper implements Veggies {}

    private class MarinaraSauce implements Sauce {}

    private class ReggianoCheese implements Cheese {}

    private class SlicedPepperoni implements Pepperoni {}

    private class FreshClams implements Clams {}

    /**
     * 方便打印披萨原料的接口
     */
    private interface ToString {
        String
    }
}
