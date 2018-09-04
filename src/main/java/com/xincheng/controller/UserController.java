package com.xincheng.controller;

import com.xincheng.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 豆璐璐
 * @description 用户 登陆注册
 * @company 易单科技
 * @date 2018/9/4 0004 11:06
 * @Version 1.0
 */

@Controller
public class UserController {

    /**
     * 用户登陆
     *
     * @param request
     * @param email    邮箱
     * @param password 密码
     * @return
     */
    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request, String email, String password) {

        if (email != null && password != null) {
            User user = new User(email, password);
            request.getSession().setAttribute("user", user);  //在拦截器中使用
            return "/index";
        } else {
            return "/login";
        }
    }

}