package com.xincheng.domain;

/**
 * @author 豆璐璐
 * @description  用户实体
 * @company 易单科技
 * @date 2018/9/4 0004 11:22
 * @Version 1.0
 */
public class User {

    private String email;
    private String passWord;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public User() {
    }

    public User(String email, String passWord) {
        this.email = email;
        this.passWord = passWord;
    }

}