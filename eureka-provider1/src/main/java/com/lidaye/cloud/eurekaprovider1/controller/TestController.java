package com.lidaye.cloud.eurekaprovider1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/run")
    public Object run() {
        return "lidaye";
    }

    @GetMapping("/hystrix")
    public String hystrix() {
        return "成功调用服务p1";
    }
}
