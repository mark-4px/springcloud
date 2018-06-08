/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *
 * @author mark
 * @date 2018年5月21日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */


@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ConsumerFeignStarter {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignStarter.class, args);
        
//        new SpringApplicationBuilder(ConsumerFeignStarter.class).web(true).run(args);
    }

}
