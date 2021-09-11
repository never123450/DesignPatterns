package com.xwy.kkb.decoratorpattern.coffeedemo;

/**
 * @Classname Cappuccino
 * @Created by 寂然
 * @Description 卡布奇诺
 */
public class Cappuccino extends Coffee{

    public Cappuccino() {

        setPrice(24.0f);

        setDesc("点了一杯卡布奇诺");
    }

    @Override
    public float cost() {

        System.out.println("当前价格为：");

        return super.getPrice();
    }
}
