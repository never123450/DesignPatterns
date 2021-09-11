package com.xwy.kkb.adapterpattern.objectadapter;

/**
 * @Classname Iphone
 * @Created by 寂然
 * @Description 用户
 */
public class Iphone {

    //手机充电方法
    public void Charding(DC dc){

        //做一个简单的校验
        if (dc.outputDC() == 5){

            System.out.println("OK,现在电压没问题了，5V，放心充吧");

        } else {

            System.out.println("注意安全，小心炸掉");
        }

    }
}
