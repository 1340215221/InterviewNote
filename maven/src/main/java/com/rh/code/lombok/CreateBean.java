package com.rh.code.lombok;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateBean {

    @NonNull
    private String name;
    private Long age;

    public static void main(String[] args) {
        new CreateBean("rh");
    }

}