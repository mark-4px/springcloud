/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mark.samples.BaseTest;
import com.mark.samples.domain.Book;
import com.mark.samples.query.BookQuery;
import com.mark.samples.util.JsonMapper;

/**
 *
 * @author mark
 * @date 2018年5月19日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
public class IBookServiceTest extends BaseTest{

    private static final Logger logger = LoggerFactory.getLogger(IBookServiceTest.class);

    
    @Resource
    private IBookService bookService;
    
    
    
    /**
     * Test method for {@link com.mark.samples.service.IBookService#getBookByPk(java.lang.Integer)}.
     */
    @Test
    public void testGetBookByPk() {
    }

    /**
     * Test method for {@link com.mark.samples.service.IBookService#count(com.mark.samples.query.BookQuery)}.
     */
    @Test
    public void testCount() {
        BookQuery query = new BookQuery();
        logger.info("count {}",bookService.count(query));
        
    }

    /**
     * Test method for {@link com.mark.samples.service.IBookService#searchBook(com.mark.samples.query.BookQuery)}.
     */
    @Test
    public void testSearchBook() {
        BookQuery query = new BookQuery();
        query.setPageSize(5);
        
        List<Book> lstBooks = bookService.searchBook(query);
        
        logger.info("**********************************************************************");
        logger.info("size {}",lstBooks.size());
        logger.info("lstBooks {}",JsonMapper.nonDefaultMapper().toJson(lstBooks));
        logger.info("**********************************************************************");
        
    }

    /**
     * Test method for {@link com.mark.samples.service.IBookService#pageBook(com.mark.samples.query.BookQuery)}.
     */
    @Test
    public void testPageBook() {
    }

    /**
     * Test method for {@link com.mark.samples.service.IBookService#insertBook(com.mark.samples.domain.Book)}.
     */
    @Test
    public void testInsertBook() {
    }

    /**
     * Test method for {@link com.mark.samples.service.IBookService#insertBooks(java.util.List)}.
     */
    @Test
    public void testInsertBooks() {
    }

    /**
     * Test method for {@link com.mark.samples.service.IBookService#updateBook(com.mark.samples.domain.Book)}.
     */
    @Test
    public void testUpdateBook() {
    }

    /**
     * Test method for {@link com.mark.samples.service.IBookService#updatePartBook(com.mark.samples.domain.Book)}.
     */
    @Test
    public void testUpdatePartBook() {
    }

    /**
     * Test method for {@link com.mark.samples.service.IBookService#deleteBook(java.lang.Integer)}.
     */
    @Test
    public void testDeleteBook() {
    }

    /**
     * Test method for {@link com.mark.samples.service.IBookService#deleteBooks(java.util.List)}.
     */
    @Test
    public void testDeleteBooks() {
    }

}
