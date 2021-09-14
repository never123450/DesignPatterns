package com.xwy.kkb.strategypattern.milkshopdemo3;

import java.util.Scanner;

/**
 * @param
 * @author xwy
 * @Description 角色分析:
 * ·抽象策略类:定义了一个公共接口，各种不同的算法以不同的方式实现了这个接口，一般使用接口或者抽象类
 * 来实现
 * ·具体策略类:可以有多个，实现了抽象策略类的接口，提供了算法的具体实现·环境类:持有一个抽象策略类的引用，最终给客户端进行调用
 * @date 14/9/2021 下午6:19
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

        System.out.println("未优惠后的总价格为 " + price);

        //创建ShopContext对象
        ShopContext shopContext = new ShopContext(new Discount());
        double resultPrice = shopContext.resultPrice(price);
        System.out.println("经过优惠后，您需要支付的价格是...." + resultPrice);
    }
}
