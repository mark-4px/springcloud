/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient.EurekaServiceInstance;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netflix.appinfo.InstanceInfo;

/**
 *
 * @author mark
 * @date 2018年5月22日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */

@Controller
public class ListEurekaServiceController {
    
    @Resource
    private EurekaDiscoveryClient discoveryClient;

    @ResponseBody
    @RequestMapping("/services")
    public String serviceUrl() {
        List<ServiceInstance> instances = discoveryClient.getInstances("mark-samples-springcloud-eureka-provider");
        
        if (instances == null || instances.size() == 0) {
            return "Service Not Found !!!";
        }
        
        StringBuilder builder = new StringBuilder();
        
        for (ServiceInstance serviceInstance : instances) {
            
            EurekaServiceInstance instance = (EurekaServiceInstance) serviceInstance;
            
            builder.append("ServiceId: ").append(instance.getServiceId()).append("\n");
            builder.append("\tIPHost: ").append(serviceInstance.getHost()).append("\n");
            builder.append("\tPort: ").append(serviceInstance.getPort()).append("\n");
            builder.append("\tUri: ").append(serviceInstance.getUri()).append("\n");
            
            InstanceInfo instanceInfo = instance.getInstanceInfo();
            if (instanceInfo != null) {
                
                builder.append("\tAppName: ").append(instanceInfo.getAppName()).append("\n");
                builder.append("\tHostName: ").append(instanceInfo.getHostName()).append("\n");
                builder.append("\tIPAddr: ").append(instanceInfo.getIPAddr()).append("\n");
                builder.append("\tVIPAddress: ").append(instanceInfo.getVIPAddress()).append("\n");
                builder.append("\tStatus: ").append(instanceInfo.getStatus()).append("\n");
                builder.append("\tHomePageUrl: ").append(instanceInfo.getHomePageUrl()).append("\n");
                
            }
            
            
            builder.append("\n--------------------------------------------------").append("\n");
        }
        
        return builder.toString();
    }
   
}
