package com.xwy.kkb.strategypattern.milkshopdemo3;

/**
 * @Classname ShopContext
 * @Created by 寂然
 * @Description 环境类
 */
public class ShopContext {

    private Promition promition;

    //通过构造方法，给策略赋值

    public ShopContext(Promition promition) {
        this.promition = promition;
    }

    //根据收费策略的不同，获取优惠后的结果
    public int resultPrice(int price){

        return promition.countPrice(price);
    }
}
