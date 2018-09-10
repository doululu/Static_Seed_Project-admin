package com.xincheng.domain;

/**
 * @author 豆璐璐
 * @description  图书实体
 * @company 易单科技
 * @date 2018/9/10 0010 16:59
 * @Version 1.0
 */
public class Book {

    private Integer id;  //图书编号
    private String bookname;  //图书名称
    private String bookauthor;  //图书作者
    private double bookprice;   //图书价格

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public double getBookprice() {
        return bookprice;
    }

    public void setBookprice(double bookprice) {
        this.bookprice = bookprice;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", bookauthor='" + bookauthor + '\'' +
                ", bookprice=" + bookprice +
                '}';
    }
}