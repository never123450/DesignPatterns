package com.xwy.kkb.strategypattern.threestrategydemo;

/**
 * @Classname ZhaoYun
 * @Created by 寂然
 * @Description 装有三个妙计的锦囊准备就绪，到了赵云执行的时候了
 */
public class ZhaoYun {

    public static void main(String[] args) {

        SilkBag silkBag;

        System.out.println("-----刚刚到吴国，遇到了危险，拆开第一个");

        silkBag = new SilkBag(new BackDoor());

        silkBag.operate();

        System.out.println("-----刘备在吴国沉迷温柔乡了,拆第二个-----");

        silkBag = new SilkBag(new GreenLight());

        silkBag.operate();

        System.out.println("----回家途中遇到孙权追兵，拆第三个锦囊-----");

        silkBag = new SilkBag(new WifeHelp());

        silkBag.operate();
    }
}
