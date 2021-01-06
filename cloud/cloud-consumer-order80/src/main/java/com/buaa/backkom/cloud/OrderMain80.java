package com.buaa.backkom.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: backkom
 * @Date: 2020/9/12 16:26
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80
{
    public static void main (String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
