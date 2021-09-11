package com.xwy.kkb.decoratorpattern.coffeedemo;

/**
 * @Classname Milk
 * @Created by 寂然
 * @Description 牛奶
 */
public class Milk extends Decorator{


    public Milk(Coffee coffee) {
        super(coffee);

        setPrice(3.0f);

        setDesc("点了一份牛奶");
    }
}
