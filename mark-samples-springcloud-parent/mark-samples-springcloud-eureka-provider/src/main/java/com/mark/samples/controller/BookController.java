/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mark.samples.domain.Book;
import com.mark.samples.query.BookQuery;
import com.mark.samples.service.IBookService;

/**
 *
 * @author mark
 * @date 2018年5月21日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */

@RestController
@RequestMapping("/book")
public class BookController {
    
    private static final Integer DEFAULT_PAGE_NO = 1;
    private static final Integer DEFAULT_PAGE_SIZE = 5;
    private static final Integer MAX_PAGE_SIZE = 100;
    
    @Resource
    private IBookService bookService;
    
    @GetMapping("/get")
    public Book getBook() {
        return bookService.getBookByPk(1);
    }
    
    @RequestMapping("/list-default")
    public List<Book> list(){
        BookQuery query = new BookQuery();
        query.setPageSize(DEFAULT_PAGE_SIZE);
        List<Book> lstBooks = bookService.searchBook(query);
        return lstBooks;
    }
    
    
    @RequestMapping("/list-by-query")
    public List<Book> listByQuery(BookQuery query){
        List<Book> lstBooks = bookService.searchBook(query);
        return lstBooks;
    }
    
    
    @RequestMapping("/list")
    public List<Book> listByQuery(@RequestParam Integer pageNo,@RequestParam Integer pageSize){
        BookQuery query = new BookQuery();
        
        if (pageNo == null || pageNo.intValue() <= 0) {
            pageNo = DEFAULT_PAGE_NO;
        }
        
        if (pageSize == null || pageSize.intValue() <= 0 || pageSize.intValue() > MAX_PAGE_SIZE) {
            pageSize = DEFAULT_PAGE_SIZE;
        }
        
        query.setPageNo(pageNo);
        query.setPageSize(pageSize);
        List<Book> lstBooks = bookService.searchBook(query);
        return lstBooks;
    }
    
}
