package com.xwy.kkb.bridgepattern;

/**
 * @Classname DeskPC
 * @Created by 寂然
 * @Description I walk very slowly, but I never walk backwards
 */
public class DeskPC extends Computer {

    public DeskPC(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("这是台式机");
    }

    @Override
    public void work() {
        super.work();
        System.out.println("这是台式机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("这是台式机");
    }
}
