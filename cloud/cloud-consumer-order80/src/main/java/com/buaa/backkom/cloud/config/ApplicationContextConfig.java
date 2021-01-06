package com.buaa.backkom.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: backkom
 * @Date: 2020/9/12 16:34
 */
@Configuration
public class ApplicationContextConfig
{
    /*
        负载均衡+服务名与真实ip转换
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
