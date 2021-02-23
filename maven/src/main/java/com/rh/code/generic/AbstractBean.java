package com.rh.code.generic;

public abstract class AbstractBean<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
