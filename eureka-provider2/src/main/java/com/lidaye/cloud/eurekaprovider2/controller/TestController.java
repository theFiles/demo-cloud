package com.lidaye.cloud.eurekaprovider2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/run")
    public Object run() {
        return "李大爷";
    }

    @GetMapping("/hystrix")
    public String hystrix() {
        throw new RuntimeException("发生异常！");
    }
}
