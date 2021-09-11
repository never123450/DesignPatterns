package com.xwy.kkb.bridgepattern;

/**
 * @Classname Computer
 * @Created by 寂然
 * @Description 电脑类型
 */
public class Computer {

    //搭建起一道桥梁
    private Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void open(){

        this.brand.open();
    }

    public void close(){

        this.brand.close();
    }

    public void work(){

        this.brand.work();
    }
}
