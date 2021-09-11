package com.xwy.kkb.adapterpattern.classadapter;

/**
 * @Classname Iphone
 * @Created by 寂然
 * @Description 手机 用户
 */
public class Iphone {

    //手机充电的方法
    public void charding(DC dc){

        //加一个校验
        if (dc.outputDC() == 5){

            System.out.println("电压正常，是5V,可以放心充电了");

        } else {

            System.out.println("注意安全......");
        }
    }
}
