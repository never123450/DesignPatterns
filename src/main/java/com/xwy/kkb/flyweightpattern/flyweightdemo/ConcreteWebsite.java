package com.xwy.kkb.flyweightpattern.flyweightdemo;

/**
 * @Classname ConcreteWebsite
 * @Created by 寂然
 * @Description 具体网站 - 具体的享元角色
 *
 */
public class ConcreteWebsite extends Website{

    private String type = "";//网站发布的形式

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    //用户就是我们网站的一个外部状态
    @Override
    public void show(User user) {

        System.out.println("以 " + type + "发布网站项目");

        System.out.println("网站的用户名是" + user.getName());
    }
}
