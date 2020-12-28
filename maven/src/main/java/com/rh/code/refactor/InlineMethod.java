package com.rh.code.refactor;

/**
 * 内联函数
 */
public class InlineMethod {

    private Integer number;

    public Integer refactor() {
        return (number > 5) ? 2 : 1;
    }

    public Integer sourceCode() {
        return isBig() ? 2 : 1;
    }

    public Boolean isBig() {
        return number > 5;
    }

    public static void main(String[] args) {
        Integer sum = 1 + 2;
        Integer sum2 = sum * 1;
    }

}
