package com.rh.code.string;

/**
 * 添加到常量池
 */
public class AddToConstantPool {

    public void addToConstantPool() {
        String oldStr = "hello world".intern();
    }

    public void append() {
        String a = "a";
        String bc = "bc";
        String abc1 = a + bc;
        String abc2 = "abc";
        System.out.println(abc1 == abc2); // false
    }

    /**
     * 字符串计算编译优化
     */
    public void compileOptimization() {
        final String a = "a";
        final String bc = "bc";
        String abc1 = a + bc;
        String abc2 = "abc";
        System.out.println(abc1 == abc2); // true
    }

}
