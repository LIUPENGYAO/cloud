package com.cloud.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud
 * @description:
 * @author: lpy
 * @create: 2019-12-23 16:05
 **/
@SpringBootApplication
@EnableDiscoveryClient //发现和注册服务
@MapperScan("com.cloud.provider.dao") //扫描
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
