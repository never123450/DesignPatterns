package com.xwy.kkb.bridgepattern;

/**
 * @Classname Ipad
 * @Created by 寂然
 * @Description Ipad子类
 */
public class Ipad extends Computer{

    public Ipad(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("这是平板电脑");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("这是平板电脑");
    }

    @Override
    public void work() {
        super.work();
        System.out.println("这是平板电脑");
    }
}
