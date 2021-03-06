/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mark.samples.domain.Book;
import com.mark.samples.query.BookQuery;

/**
 *
 * @author mark
 * @date 2018年5月22日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */

@FeignClient("mark-samples-springcloud-eureka-provider")
public interface IBookFeginService {

    /**
     * 简单对象获取
     * 
     * @return
     */
    @RequestMapping(value = "/book/get", method = RequestMethod.GET, consumes = "application/json")
    public Book get();

    /**
     * 集合对象获取
     * 
     * @return
     */
    @RequestMapping(value = "/book/list-default", method = RequestMethod.GET, consumes = "application/json")
    public List<Book> list();

    /**
     * 对象参数
     * 
     * @param query
     * @return
     */
    @RequestMapping(value = "/book/list-by-query", method = RequestMethod.POST, consumes = "application/json")
    public List<Book> listByQuery(BookQuery query);

}
