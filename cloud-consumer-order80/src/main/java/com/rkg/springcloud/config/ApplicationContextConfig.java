package com.rkg.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced//添加resttemplate的负载均衡,否则在调用消费者时提示无法识别消费者主机
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
 
 
