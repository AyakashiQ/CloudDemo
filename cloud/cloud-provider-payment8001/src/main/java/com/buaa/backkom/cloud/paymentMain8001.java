package com.buaa.backkom.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: backkom
 * @Date: 2020/9/12 11:41
 */
@SpringBootApplication
@EnableEurekaClient
public class paymentMain8001
{
    public static void main (String[] args) {
        SpringApplication.run(paymentMain8001.class,args);
    }
}
