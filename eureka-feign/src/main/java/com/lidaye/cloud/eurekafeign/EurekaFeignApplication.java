package com.lidaye.cloud.eurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EurekaFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignApplication.class, args);
    }

}
