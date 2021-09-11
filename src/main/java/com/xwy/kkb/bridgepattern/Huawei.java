package com.xwy.kkb.bridgepattern;

/**
 * @Classname Huawei
 * @Created by 寂然
 * @Description s实现类 华为
 */
public class Huawei implements Brand {

    @Override
    public void open() {
        System.out.println("华为电脑开机中");
    }

    @Override
    public void close() {

        System.out.println("华为电脑关机中");
    }

    @Override
    public void work() {

        System.out.println("华为电脑工作中");
    }
}
