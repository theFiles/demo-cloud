package com.lidaye.cloud.eurekafeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("p1")
public interface P1ApiService {
    @GetMapping("/run")
    String run();
}
