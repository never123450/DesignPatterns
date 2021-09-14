package com.xwy.kkb.strategypattern.milkshopdemo3;

/**
 * @param
 * @author xwy
 * @Description 环境类
 * @date 14/9/2021 下午6:22
 * @return
 */
public class ShopContext {

    private Promition promition;

    //通过构造方法，给策略赋值

    public ShopContext(Promition promition) {
        this.promition = promition;
    }

    //根据收费策略的不同，获取优惠后的结果
    public double resultPrice(int price) {

        return promition.countPrice(price);
    }
}
