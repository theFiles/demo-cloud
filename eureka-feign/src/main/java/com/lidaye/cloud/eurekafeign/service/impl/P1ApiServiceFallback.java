package com.lidaye.cloud.eurekafeign.service.impl;

import com.lidaye.cloud.eurekafeign.service.P1ApiService;
import org.springframework.stereotype.Component;

@Component
public class P1ApiServiceFallback implements P1ApiService {
    @Override
    public String run() {
        return null;
    }

    @Override
    public String hystrix() {
        return "服务降级啦！！！！！";
    }
}
