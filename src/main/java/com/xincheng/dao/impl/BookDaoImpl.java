package com.xincheng.dao.impl;

import com.xincheng.dao.BookDao;
import com.xincheng.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 豆璐璐
 * @description
 * @company 易单科技
 * @date 2018/9/10 0010 17:11
 * @Version 1.0
 */

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer add(Book book) {

        String sql="insert into book(bookname,bookauthor,bookprice) values('语文','老哥',16)";
        return jdbcTemplate.update(sql);
    }

    @Override
    public Integer delete(Book book) {
        return null;
    }

    @Override
    public Integer update(Book book) {
        return null;
    }

    @Override
    public List<Map<String, Object>> query() {

        String sql="select * from book";
        return jdbcTemplate.queryForList(sql);
    }
}