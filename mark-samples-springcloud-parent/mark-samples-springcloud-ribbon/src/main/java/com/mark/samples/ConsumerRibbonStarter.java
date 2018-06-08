/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author mark
 * @date 2018年5月21日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
@EnableEurekaClient
@SpringBootApplication
public class ConsumerRibbonStarter {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ConsumerRibbonStarter.class, args);
    }

}
