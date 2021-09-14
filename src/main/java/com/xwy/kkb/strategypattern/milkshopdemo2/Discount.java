package com.xwy.kkb.strategypattern.milkshopdemo2;

/**
 * @Description Discount
 * @author xwy
 * @date 14/9/2021 下午6:02
 * @param
 * @return
 */
public class Discount extends Promition {

    private int discount;

    @Override
    public int countPrice(int price) {
        //当然了这里应该加上各种校验
        return price * discount;
    }
}
