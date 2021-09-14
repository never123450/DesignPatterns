package com.xwy.kkb.strategypattern.milkshopdemo1;

/**
 * @param
 * @author xwy
 * @Description 收银台
 * @date 14/9/2021 下午5:51
 * @return
 */
public class Cashier {

    private Milk milk;

    public Cashier(Milk milk) {
        this.milk = milk;
    }

    //收银计算方法
    public int countPrice() {
        int money;
        return money = milk.getCount() * milk.getPrice();
    }
}
