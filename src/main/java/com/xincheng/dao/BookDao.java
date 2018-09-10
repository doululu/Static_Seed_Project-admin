package com.xincheng.dao;

import com.xincheng.domain.Book;

import java.util.List;
import java.util.Map;

public interface BookDao {

    /**
     * 图书增删该查
     */

    Integer add(Book book);
    Integer delete(Book book);
    Integer update(Book book);
    List<Map<String, Object>> query();
}
