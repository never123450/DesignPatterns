package com.xwy.kkb.decoratorpattern.coffeedemo;

/**
 * @Classname Sugar
 * @Created by 寂然
 * @Description 方糖
 */
public class Sugar extends Decorator{

    public Sugar(Coffee coffee) {
        super(coffee);

        setPrice(2.0f);

        setDesc("又加了一份糖");
    }
}
