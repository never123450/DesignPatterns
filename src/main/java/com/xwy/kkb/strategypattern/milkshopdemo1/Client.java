package com.xwy.kkb.strategypattern.milkshopdemo1;

import java.util.Scanner;

/**
 * @Classname Client
 * @Created by 寂然
 * @Description 客户端
 */

//现在有一个需求：做一个牛奶商店的收银软件
//    营业员要根据牛奶的单价和数量，向客户收费
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

//        ""

        //switch case

        //case 1  : 打五折
        //case 2 :打七折

        System.out.println("收款台经过计算，总价格为 " + price);
    }
}
