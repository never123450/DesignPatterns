package com.xwy.kkb.strategypattern.milkshopdemo2;

/**
 * @param
 * @author xwy
 * @Description 牛奶实体类
 * @date 14/9/2021 下午5:56
 * @return
 */
public class Milk {

    private int price; //牛奶的单价

    private int count; //牛奶的订单数量

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Milk(int price, int count) {
        this.price = price;
        this.count = count;
    }

    public Milk() {
    }
}
