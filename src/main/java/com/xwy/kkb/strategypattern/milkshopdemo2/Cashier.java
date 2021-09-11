package com.xwy.kkb.strategypattern.milkshopdemo2;

/**
 * @Classname Cashier
 * @Created by 寂然
 * @Description 收款台
 */
public class Cashier {

    private Milk milk;

    public Cashier(Milk milk) {
        this.milk = milk;
    }

    //收银计算方法
    public int countPrice(){

        int money;

        return money = milk.getCount() * milk.getPrice();
    }
}
