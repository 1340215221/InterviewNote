package com.rh.code.design.observer.customize;

/**
 * 装饰者
 */
class Mocha extends CondimentDecorator {

    /**
     * 饮料对象
     * 被装饰者
     */
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
