package com.xwy.kkb.strategypattern.milkshopdemo1;

import java.util.Scanner;

/**
 * @param
 * @author xwy
 * @Description 现在有一个需求：做一个牛奶商店的收银软件
 * 营业员要根据牛奶的单价和数量，向客户收费
 *
 * 基本介绍
 * 在软件开发中也有这样的情况，当我们实现某一个功能，存在多种算法或者策略下一个定义:
 * 策略模式定义了一系列算法，并且将每个算法封装起来，使得他们可以相互替换，
 * 而且算法的变化不会影响使用算法的客户端
 *
 * @date 14/9/2021 下午5:50
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

        //case 1  : 打五折
        //case 2 :打七折

        System.out.println("收款台经过计算，总价格为 " + price);
    }
}
