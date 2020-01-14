package com.cloud.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud
 * @description:
 * @author: lpy
 * @create: 2019-12-23 16:09
 **/
@RestController
public class HelloController {
    @GetMapping("api/hello/helloword.do")
    public String hello() {
        System.out.println("provider====================================");
        return "hello";
    }
}
