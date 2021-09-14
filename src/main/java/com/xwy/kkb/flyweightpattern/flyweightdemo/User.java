package com.xwy.kkb.flyweightpattern.flyweightdemo;

/**
 * @Description 网站的用户
 * @author xwy
 * @date 14/9/2021 下午2:41
 * @param
 * @return
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
