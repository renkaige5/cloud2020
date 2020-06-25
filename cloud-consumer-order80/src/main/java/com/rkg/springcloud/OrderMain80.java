package com.rkg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication

public class OrderMain80 {
    public static void main(String[] args) {
         SpringApplication.run(OrderMain80.class,args);
    }

}
 
 
