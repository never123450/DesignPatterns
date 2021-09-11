package com.xwy.kkb.bridgepattern;

/**
 * @Classname XiaoMi
 * @Created by 寂然
 * @Description I walk very slowly, but I never walk backwards
 */
public class XiaoMi implements Brand {

    @Override
    public void open() {
        System.out.println("小米电脑开机中");
    }

    @Override
    public void close() {

        System.out.println("小米电脑关机中");
    }

    @Override
    public void work() {

        System.out.println("小米电脑工作中");
    }
}
