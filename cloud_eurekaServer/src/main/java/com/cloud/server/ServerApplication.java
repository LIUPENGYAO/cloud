package com.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: cloud
 * @description:
 * @author: lpy
 * @create: 2019-12-23 15:50
 **/
@SpringBootApplication
@EnableEurekaServer //标记这是一个注册中心
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
    }

}
