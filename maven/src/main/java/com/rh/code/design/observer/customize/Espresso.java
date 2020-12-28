package com.rh.code.design.observer.customize;

/**
 * 浓缩咖啡
 */
class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
