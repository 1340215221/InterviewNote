package com.rh.code.refactor;

public class ReplaceTempWithQuery {

    private Integer num1;
    private Integer num2;

    public Double refactor() {
        if (product() > 1000) {
            return product() * 0.95;
        } else {
            return product() * 0.98;
        }
    }

    private double product() {
        return num1 + num2;
    }

    public Double sourceCode() {
        double product = num1 + num2;
        if (product > 1000) {
            return product * 0.95;
        } else {
            return product * 0.98;
        }
    }

}
