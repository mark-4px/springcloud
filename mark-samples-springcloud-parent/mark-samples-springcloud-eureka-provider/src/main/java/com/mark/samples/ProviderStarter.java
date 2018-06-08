/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * @author mark
 * @date 2018年5月21日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
@EnableDiscoveryClient // 激活eureka中的DiscoveryClient实现
@SpringBootApplication
public class ProviderStarter {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderStarter.class).web(true).run(args);
    }

}
