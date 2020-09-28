package com.rh.code.integer;

/**
 * 封装类型缓存
 */
public class PackageTypeCache {

    public void testCache() {
        Integer num1 = 1;
        Integer num2 = 1;
        System.out.println(num1 == num2); // true

        Integer num3 = 128;
        Integer num4 = 128;
        System.out.println(num3 == num4); // false
    }

}
