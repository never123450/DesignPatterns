package com.xwy.kkb.strategypattern.milkshopdemo3;

/**
 * @Description Discount
 * @author xwy
 * @date 14/9/2021 下午6:21
 * @param
 * @return
 */
public class Discount extends Promition {

    private double discount = 0.8;

    @Override
    public double countPrice(int price) {

        //当然了这里应该加上各种校验
        return price * discount;
    }
}
