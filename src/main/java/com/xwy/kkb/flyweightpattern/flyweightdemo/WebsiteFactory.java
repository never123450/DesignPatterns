package com.xwy.kkb.flyweightpattern.flyweightdemo;

import java.util.HashMap;

/**
 * @Classname WebsiteFactory
 * @Created by 寂然
 * @Description 享元工厂类
 */
public class WebsiteFactory {

    //创建HashMap，充当池的角色
    private HashMap<String,ConcreteWebsite> pool = new HashMap<>();

    //获取池子里对象的方法
    //根据类型判断
    public Website getWebsite(String type){

        if (!pool.containsKey(type)){

            pool.put(type,new ConcreteWebsite(type));
        }

        return (Website) pool.get(type);
    }


    //获取池子里的对象总数
    public int getWebsiteCount(){

        System.out.println("当前的池子里面对象的总数是" + pool.size());
        return pool.size();//返回当前池子的总容量
    }
}
