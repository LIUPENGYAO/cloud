package com.cloud.consumer.controller;

import com.cloud.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud
 * @description:
 * @author: lpy
 * @create: 2019-12-23 16:30
 **/
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("api/hello/first.do")
    public String hi() {
        return  helloService.hello();
    }
}
