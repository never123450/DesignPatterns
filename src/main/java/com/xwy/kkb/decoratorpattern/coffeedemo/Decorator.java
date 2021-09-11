package com.xwy.kkb.decoratorpattern.coffeedemo;

/**
 * @Classname Decorator
 * @Created by 寂然
 * @Description 装饰者
 */
public class Decorator extends Coffee{

    //聚合主体
    private  Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }


    //重写计费方法
    @Override
    public float cost() {
        return super.getPrice() + coffee.cost();
    }

    //增加描述

    @Override
    public String getDesc() {
        return super.getDesc() + coffee.getDesc();
    }
}
