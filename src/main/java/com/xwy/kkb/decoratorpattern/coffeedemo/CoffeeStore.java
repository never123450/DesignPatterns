package com.xwy.kkb.decoratorpattern.coffeedemo;

/**
 * @Classname CoffeeStore
 * @Created by 寂然
 * @Description 咖啡店
 */
public class CoffeeStore {

    public static void main(String[] args) {

        //点了一杯卡布奇诺，加了一份牛奶两份糖

        //先制作卡布奇诺
        Coffee order = new Cappuccino();

        System.out.println(order.getDesc());

        System.out.println(order.cost());

        //加了一份牛奶
        order = new Milk(order);

        System.out.println(order.getDesc());

        System.out.println(order.cost());


        //加了一份热牛奶
        order = new HotMilk(order);

        System.out.println(order.getDesc());

        System.out.println(order.cost());

    }
}
