package com.xwy.kkb.decoratorpattern.coffeedemo;

/**
 * @Classname HotMilk
 * @Created by 寂然
 * @Description I walk very slowly, but I never walk backwards
 */
public class HotMilk extends Decorator {

    public HotMilk(Coffee coffee) {
        super(coffee);

        setPrice(4.0f);

        setDesc("点了一份热牛奶");
    }
}
