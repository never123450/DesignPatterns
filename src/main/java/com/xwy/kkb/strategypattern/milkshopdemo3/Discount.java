package com.xwy.kkb.strategypattern.milkshopdemo3;

/**
 * @Classname Discount
 * @Created by 寂然
 * @Description I walk very slowly, but I never walk backwards
 */
public class Discount extends Promition {

    private int discount;

    @Override
    public int countPrice(int price) {

        //当然了这里应该加上各种校验
        return price * discount;
    }
}
