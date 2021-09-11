package com.xwy.kkb.bridgepattern;

/**
 * @Classname Apple
 * @Created by 寂然
 * @Description 实现类 Apple
 */
public class Apple implements Brand{

    @Override
    public void open() {
        System.out.println("苹果电脑开机中");
    }

    @Override
    public void close() {

        System.out.println("苹果电脑关机中");
    }

    @Override
    public void work() {

        System.out.println("苹果电脑工作中");
    }
}
