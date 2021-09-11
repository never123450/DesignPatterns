package com.xwy.kkb.decoratorpattern.coffeedemo;

/**
 * @Classname Coffee
 * @Created by 寂然
 * @Description 咖啡基类 - 主体
 */
public abstract class Coffee {

    private String Desc; //描述

    private float price; //价格

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //还有计费的功能
    public abstract float cost();
}
