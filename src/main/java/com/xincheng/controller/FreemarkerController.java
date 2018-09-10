package com.xincheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 豆璐璐
 * @description
 * @company 易单科技
 * @date 2018/8/30 0030 16:16
 * @Version 1.0
 */
@Controller
public class FreemarkerController {

    @RequestMapping(value = "/goFreemarker")
    public String goFreemarker(ModelMap modelMap){

        modelMap.put("name","张三");
        modelMap.put("sex", 1);    //sex:性别，1：男、 0：女

        return "/freemarkerTest";
    }
}