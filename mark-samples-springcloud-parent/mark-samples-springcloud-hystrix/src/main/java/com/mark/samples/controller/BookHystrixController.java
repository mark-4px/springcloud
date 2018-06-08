/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mark.samples.domain.Book;
import com.mark.samples.query.BookQuery;
import com.mark.samples.service.IBookFeginService;

/**
 *
 * @author mark
 * @date 2018年5月22日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */

@RequestMapping("/book/hystrix")
@RestController
public class BookHystrixController {

    @Resource
    private IBookFeginService bookFeginService;

    /**
     * 简单对象获取
     * 
     * @return
     */

    @RequestMapping("/get")
    public Book get() {
        return bookFeginService.get();
    }

    /**
     * 集合对象获取
     * 
     * @return
     */
    @RequestMapping("/list-default")
    public List<Book> list() {
        return bookFeginService.list();
    }

    /**
     * 对象参数
     * 
     * @param query
     * @return
     */
    @RequestMapping("/list-by-query")
    public List<Book> listByQuery() {
        BookQuery query = new BookQuery();
        query.setPageNo(1);
        query.setPageSize(30);

        return bookFeginService.listByQuery(query);
    }

}
