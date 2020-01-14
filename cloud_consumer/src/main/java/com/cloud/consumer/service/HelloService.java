package com.cloud.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: cloud
 * @description:
 * @author: lpy
 * @create: 2019-12-23 16:25
 **/
@FeignClient("xph-provider") //标记对应的服务提供者名称 接口中的方法要与provider controller中映射方法对应
public interface HelloService {
    @GetMapping("api/hello/helloword.do")
    String hello();
}
