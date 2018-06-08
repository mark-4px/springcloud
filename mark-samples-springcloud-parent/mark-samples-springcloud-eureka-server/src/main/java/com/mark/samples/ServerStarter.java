/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * @author mark
 * @date 2018年5月21日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
@EnableEurekaServer  //启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class ServerStarter {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
      //下面两行代码都可以用来启动
        SpringApplication.run(ServerStarter.class, args);
        
    }

}
