package com.rh.code.design.factory.customize;

/**
 * 订购披萨
 *
 * 新需求 :
 * 取消披萨店对简单工厂对象的依赖--工厂方法
 */
public class Main {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza veggie = nyPizzaStore.createPizza("veggie");
        System.out.println("我收到一个" + veggie.getClass().getSimpleName());

        Pizza clam = nyPizzaStore.createPizza("clam");
        System.out.println("我收到一个" + clam.getClass().getSimpleName());
    }

    /**
     * 变化部分 :
     * 现在披萨店不依赖于简单工厂对象, 而依赖自身的一个抽象接口{@link PizzaStore#createPizza}来创建披萨实例
     * 原本通过简单工厂子类区分不同风味的披萨, 现在通过披萨店的不同子类区分生成不同的披萨
     *
     * 依赖变化 :
     * 简单工厂中, 披萨店子类不依赖具体的披萨类型, 只依赖于简单工厂的父类
     * 工厂方法中, 披萨店子类依赖具体的披萨类型, 取消了对简单工厂的代理
     */

}
