package com.rh.code.design.factory.orginal3;

/**
 * 芝加哥风味披萨工厂
 */
class ChicagoPizzaFactory extends SimplePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        // todo 自定义实现 纽约风味披萨
        if ("veggie".equals(type)) {
            return new ChicagoVeggiePizza();
        }
        return super.createPizza(type);
    }

    public static class ChicagoVeggiePizza extends VeggiePizza {}
}
