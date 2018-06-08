/*
 * Copyright (c) 2016, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
 package com.mark.samples.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mark.common.page.Pagination;
import com.mark.samples.dao.IBookDao;
import com.mark.samples.domain.Book;
import com.mark.samples.query.BookQuery;
import com.mark.samples.service.IBookService;

/**
 * Book Service实现
 * 
 * @author mark.wu
 * @date 2018-05-09
 */
@Service
@Transactional
public class BookServiceImpl implements IBookService {

    /**
     *  Dao
     */
    @Autowired
    private IBookDao bookDao;

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public Book getBookByPk( Integer id ) {
        return bookDao.getByPk( id );
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long count(BookQuery query) {
        return bookDao.getCount(query);
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Book> searchBook(BookQuery query) {
        return bookDao.search(query);
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public Pagination<Book> pageBook(BookQuery query) {
        Long totalCount = count(query);
        Pagination<Book> pagination = new Pagination<Book>(query.getPageNo(),query.getPageSize(), totalCount);
        if (totalCount > 0) {
            pagination.setData(bookDao.queryByPage(query));
        }
        return pagination;
    }

    @Override
    public int insertBook(Book book) {
        return bookDao.insert(book);
    }

    @Override
    public int insertBooks(List<Book> books) {
        return bookDao.insertBatch(books);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.update(book);
    }
    
    @Override
    public int updatePartBook(Book book) {
        return bookDao.updatePart(book);
    }

    @Override
    public int deleteBook( Integer id ) {
        return bookDao.deleteByPk( id );
    }

    @Override
    public int deleteBooks(List<BookQuery> queries) {
        return bookDao.deleteBatchByPks(queries);
    }

}
