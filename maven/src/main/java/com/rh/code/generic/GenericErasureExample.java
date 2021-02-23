package com.rh.code.generic;

import cn.hutool.core.util.ReflectUtil;

/**
 * 泛型擦除 演示例子
 */
public class GenericErasureExample<T> {

    private T value;

    public static void main(String[] args) {
        GenericErasureExample<String> example = new GenericErasureExample<>();
        ReflectUtil.setFieldValue(example, "value", 1);
        Object value = example.value; // 泛型值如果没有声明类型 System.out.println(example.value), 编译时会变成类型强转 System.out.println((String)example.value)
        System.out.println(value); // 1
    }

}
