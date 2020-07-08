package com.lidaye.cloud.eurekafeign.controller;

import com.lidaye.cloud.eurekafeign.service.P1ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private P1ApiService p1Api;

    @GetMapping("/runP1")
    public Object runP1() {
        return p1Api.run();
    }
}
