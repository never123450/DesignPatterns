package com.xwy.kkb.decoratorpattern.coffeedemo;

/**
 * @Classname Espresso
 * @Created by 寂然
 * @Description 意大利浓咖啡  具体的主体
 */
public class Espresso extends Coffee{

    public Espresso() {

        setPrice(18.0f);

        setDesc("点了一杯意大利浓咖啡");
    }

    @Override
    public float cost() {
        return 0;
    }
}
