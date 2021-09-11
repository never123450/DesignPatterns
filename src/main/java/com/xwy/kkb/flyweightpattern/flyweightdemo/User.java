package com.xwy.kkb.flyweightpattern.flyweightdemo;

/**
 * @Classname User
 * @Created by 寂然
 * @Description 网站的用户
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
