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
public class PaymentMain8002
{
    public static void main (String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
