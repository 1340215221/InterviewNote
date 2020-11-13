package com.rh.code.design.factory.customize2;

import java.util.ArrayList;

/**
 * 披萨 抽象类
 */
abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("prepare");
    }

    void back() {
        System.out.println("back");
    }

    void cut() {
        System.out.println("cut");
    }

    void box() {
        System.out.println("box");
    }

    public String getName() {
        return name;
    }
}
