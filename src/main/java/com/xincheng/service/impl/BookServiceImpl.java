package com.xincheng.service.impl;

import com.xincheng.dao.BookDao;
import com.xincheng.domain.Book;
import com.xincheng.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author 豆璐璐
 * @description  图书增删该查
 * @company 易单科技
 * @date 2018/9/10 0010 17:09
 * @Version 1.0
 */

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public Integer add(Book book) {
        return bookDao.add(book);
    }

    @Override
    public Integer delete(Book book) {
        return bookDao.delete(book);
    }

    @Override
    public Integer update(Book book) {
        return bookDao.update(book);
    }

    @Override
    public List<Map<String, Object>> query() {
        return bookDao.query();
    }
}