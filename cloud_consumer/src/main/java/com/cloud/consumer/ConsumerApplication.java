package com.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: cloud
 * @description:
 * @author: lpy
 * @create: 2019-12-23 16:24
 **/
@SpringBootApplication
@EnableDiscoveryClient //发现和注册服务
@EnableFeignClients //启用Feign(调用提供者) 自动生成接口的实现类对象
@EnableSwagger2 //启用swagger
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
