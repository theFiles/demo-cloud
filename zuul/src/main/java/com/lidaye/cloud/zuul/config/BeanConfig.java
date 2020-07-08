package com.lidaye.cloud.zuul.config;

import com.lidaye.cloud.zuul.comm.CustomizeRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public IRule getRule() {
        return new CustomizeRule();
    }
}
