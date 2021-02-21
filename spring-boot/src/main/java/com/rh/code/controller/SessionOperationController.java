package com.rh.code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * session cookie 测试
 */
@RestController
public class SessionCookieController {

    /**
     * 设置session
     */
    @GetMapping("addSession")
    public void addSession(HttpSession session) {
        session.setAttribute("token", "123456");
        session.setMaxInactiveInterval(300); // 单位为秒
    }

    /**
     * 设置session失效
     */
    @GetMapping("updateSessionInvalid")
    public void updateSessionInvalid(HttpSession session) {
        session.removeAttribute("token");
    }

    /**
     * 获得session
     */
    @GetMapping("hasSession")
    public void hasSession(HttpSession session) {
        System.out.println(session.getAttribute("token"));
    }
}
