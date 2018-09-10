package com.xincheng.service;

import com.xincheng.domain.Book;

import java.util.List;
import java.util.Map;

public interface BookService {

    /**
     * 图书增删该查
     */

    Integer add(Book book);
    Integer delete(Book book);
    Integer update(Book book);
    List<Map<String, Object>> query();

}
