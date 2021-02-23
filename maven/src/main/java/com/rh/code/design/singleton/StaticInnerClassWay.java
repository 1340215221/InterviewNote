package com.rh.code.design.singleton;

/**
 * 静态内部类实现方式
 */
public class StaticInnerClassWay {

    private StaticInnerClassWay() {
    }

    public static StaticInnerClassWay getInstance() {
        return StaticInnerClassWayHolder.INSTANCE;
    }

    public static class StaticInnerClassWayHolder {
        private static final StaticInnerClassWay INSTANCE = new StaticInnerClassWay();
    }
}
