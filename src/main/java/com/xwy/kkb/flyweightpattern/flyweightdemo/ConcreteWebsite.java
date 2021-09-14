package com.xwy.kkb.flyweightpattern.flyweightdemo;

/**
 * @Description 具体网站 - 具体的享元角色
 * @author xwy
 * @date 14/9/2021 下午2:40
 * @param
 * @return
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
