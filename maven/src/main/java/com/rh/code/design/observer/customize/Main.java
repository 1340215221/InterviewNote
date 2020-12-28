package com.rh.code.design.observer.customize;

/**
 * 星光咖啡
 */
class Main {

    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        System.out.println(espresso.getDescription()
                + " $" + espresso.cost());

        // 选择咖啡
        Beverage beverage2 = new HouseBlend();
        // 添加调料
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
    }

    /**
     * 思考:
     * 1. 装饰者模式中使用了继承
     * 使用继承用于达到 装饰者和被装饰者必须是一样的类型, 装饰者能够取代被装饰者
     * 并不利用继承获得"行为", 行为不由父类提供, 由子类提供
     * 2. 如果使用继承, 在编译期就确定了对象之间的依赖关系
     * 使用装饰者, 可以在运行时动态组合 建立对象依赖关系
     * 3. todo 如果依赖继承, 每当需要新行为时, 还得修改现有的代码
     * 4. 为什么不把Beverage设计为一个接口, 而是一个抽象类
     * 原始代码中的Beverage可以正常工作, 我们就尽量避免去修改已有代码
     *
     *
     * 注意:
     * 1. 装饰者是依赖抽象编程的, 如果需要依赖具体类型编程装饰者就会出问题
     * 装饰者会改变对象的类型
     * 2. 装饰者知道这一连串装饰链条中其他装饰者的存在吗
     * 装饰者应该做的事, 就是增加行为到被包装对象上.
     * 当需要窥视装饰者链中的每一个装饰者时, 就超出他们的天赋了.
     * 要做的话, 可以添加CondimentPrettyPrint装饰者, 解析getDescription返回装饰者集合
     * 3. 装饰者模式造成设计中通常有大量的小类
     * 4. 装饰者在实例化组件时, 需要实例化需要的组件, 并将这些组件组装起来, 这增加了代码的负责度
     * 使用工厂模式和生成器模式会有帮助
     */

}
