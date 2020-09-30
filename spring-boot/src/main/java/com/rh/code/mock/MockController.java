package com.rh.code.mock;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * mock测试这个contraller类
 */
@RestController
@RequestMapping("rest/mock")
public class MockController {

    @PostMapping("findMockMethod")
    public ResponseResult findMockMethod(@RequestBody Order order) {
        return ResponseResult.ok(order);
    }

}
