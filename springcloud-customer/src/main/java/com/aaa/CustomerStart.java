package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// 注册为feign得客户端，可以向服务端发送http请求，调用对应的接口
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CustomerStart {
    public static void main(String[] args) {
        SpringApplication.run(CustomerStart.class,args);
    }
}
