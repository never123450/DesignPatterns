package com.xwy.kkb.facadepattern.facadedemo1;

/**
 * @Description 爆米花机
 * @author xwy
 * @date 14/9/2021 上午10:20
 * @param
 * @return
 */
public class Popcorn {

    private static Popcorn popcorn = new Popcorn();

    private Popcorn(){}

    public static Popcorn getInstance(){
        return popcorn;
    }

    public void on(){
        System.out.println("打开爆米花机");
    }

    public void off(){
        System.out.println("关闭爆米花机");
    }

    public void pop(){
        System.out.println("制作爆米花");
    }
}
