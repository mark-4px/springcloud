/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mark.samples.domain.Book;
import com.mark.samples.domain.query.BookQuery;

/**
 *
 * @author mark
 * @date 2018年5月22日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */

@RequestMapping("/book/ribbon")
@RestController
public class BookRibbonController {

    @Resource
    private RestTemplate restTemplate;
    
    /**
     * 简单对象获取
     * @return
     */
    @RequestMapping("/get")
    public Book get(){
        Book book = restTemplate.getForObject("http://mark-samples-springcloud-eureka-provider/book/get", Book.class);
        return book;
    }
    
    /**
     * 集合对象获取
     * @return
     */
    @RequestMapping("/list-default")
    public List<Book> list(){
        @SuppressWarnings("unchecked")
        List<Book> lstBooks = (List<Book>) restTemplate.getForObject("http://mark-samples-springcloud-eureka-provider/book/list-default", List.class);
        return lstBooks;
    }
    
    
    /**
     * 对象参数
     * @param query
     * @return
     */
    @RequestMapping("/list-by-query")
    public List<Book> listByQuery(){
        BookQuery query = new BookQuery();
        query.setPageNo(2);
        query.setPageSize(50);
        
        @SuppressWarnings("unchecked")
        List<Book> lstBooks = (List<Book>) restTemplate.getForObject("http://mark-samples-springcloud-eureka-provider/book/list-by-query", List.class,query);
        return lstBooks;
    }
    
}
