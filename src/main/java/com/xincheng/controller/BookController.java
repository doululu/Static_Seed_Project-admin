package com.xincheng.controller;

import com.xincheng.service.BookService;
import com.xincheng.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
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
     * 处理文件上传
     */
    @RequestMapping(value = "/toFileUp")
    @ResponseBody
    public String toFileUp(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request) { //@RequestParam 将指定的请求参数赋值给方法中的形参
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();

        String filePath ="E:\\imgupload\\";   //自定义图片上传位置
//        String filePath = request.getSession().getServletContext().getRealPath("imgupload/");
        try {
            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
        }
        return "uploadimg success";  //返回json

    }

}