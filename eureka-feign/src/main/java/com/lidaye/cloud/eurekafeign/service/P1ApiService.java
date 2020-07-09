package com.lidaye.cloud.eurekafeign.service;

import com.lidaye.cloud.eurekafeign.service.impl.P1ApiServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "p1",fallback = P1ApiServiceFallback.class)
public interface P1ApiService {
    @GetMapping("/run")
    String run();

    @GetMapping("/hystrix")
    String hystrix();
}
