package com.xwy.kkb.strategypattern.milkshopdemo2;

import java.util.Scanner;

/**
 * @param
 * @author xwy
 * @Description 现在有一个需求：做一个牛奶商店的收银软件
 * 营业员要根据牛奶的单价和数量，向客户收费
 * <p>
 * 角色分析:
 * ·抽象策略类:定义了一个公共接口，各种不同的算法以不同的方式实现了这个接口，一般使用接口或者抽象类
 * 来实现
 * ·具体策略类:可以有多个，实现了抽象策略类的接口，提供了算法的具体实现·环境类:持有一个抽象策略类的引用，最终给客户端进行调用
 * @date 14/9/2021 下午6:01
 * @return
 */

public class Client {

    public static void main(String[] args) {

        Milk milk = new Milk();

        System.out.println("请输入牛奶的当季价格");

        Scanner scanner = new Scanner(System.in);

        milk.setPrice(scanner.nextInt());

        System.out.println("请输入牛奶的销量");

        Scanner scannerNext = new Scanner(System.in);

        milk.setCount(scannerNext.nextInt());

        int price = new Cashier(milk).countPrice();

        //switch case
        System.out.println("收款台经过计算，总价格为 " + price);
    }
}
