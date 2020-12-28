package com.rh.code.mock

class ParentClass {

    void execute() {
        method1()
        println 'execute end'
    }

    private Integer method1() {
        println 'method1'
        return 1;
    }
}
