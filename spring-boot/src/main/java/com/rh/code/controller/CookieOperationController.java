package com.rh.code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/**
 * 操作cookie 测试
 */
@RestController
public class CookieOperationController {

    /**
     * 设置session
     */
    @GetMapping("addCookie")
    public void addCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("token-cookie", "123");
        cookie.setMaxAge(300); // 单位为秒
//        cookie.setPath("");
        response.addCookie(cookie);
    }

    /**
     * 设置session失效
     */
    @GetMapping("updateCookieInvalid")
    public void updateCookieInvalid(HttpServletResponse response) {
        Cookie cookie = new Cookie("token-cookie", "");
        cookie.setMaxAge(0); // 单位为秒
//        cookie.setPath("");
        response.addCookie(cookie);
    }

    /**
     * 获得session
     */
    @GetMapping("hasCookie")
    public String hasCookie(HttpServletRequest request) {
        return Arrays.stream(request.getCookies())
                .filter(e -> "token-cookie".equals(e.getName()))
                .findFirst()
                .map(Cookie::getValue)
                .orElse(null);
    }
}
