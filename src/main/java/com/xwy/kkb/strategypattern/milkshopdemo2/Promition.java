package com.xwy.kkb.strategypattern.milkshopdemo2;

/**
 * @Classname Promition
 * @Created by 寂然
 * @Description 所有商家优惠活动的父类
 */
public abstract class Promition {

    //定义一个计算优惠后的价格的算法
    public abstract int countPrice(int price);
}
