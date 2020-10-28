package com.rh.code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试服务可用controller
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello world";
    }

}
