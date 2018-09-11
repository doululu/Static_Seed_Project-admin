package com.xincheng.controller;

import com.xincheng.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @author 豆璐璐
 * @description  图书增删该查
 * @company 易单科技
 * @date 2018/9/10 0010 17:02
 * @Version 1.0
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    /**
     * 添加图书
     */

    @RequestMapping(value = "/add")
    public Integer add(){

        System.out.println("进来了");
//        return bookService.add(book);

        return 1;
    }

    /**
     * 图书查询
     */
    @RequestMapping(value = "/queryBook")
    public String query(ModelMap modelMap){

        List<Map<String, Object>> booklist = bookService.query();
        modelMap.put("bookList",booklist);

        return "/book";

    }

    /**
     * 跳转到文件上传页面
     * @return
     */
    @RequestMapping(value = "/fileUp")
    public String fileUp(){

        return "/fileup";
    }

    /**
     * 进行文件上传
     */
    @RequestMapping(value = "/toFileUp")
    public void toFileUp(){

        System.out.println("文件上传");

    }
}