package com.xwy.kkb.strategypattern.milkshopdemo3;

/**
 * @param
 * @author xwy
 * @Description 所有商家优惠活动的父类
 * @date 14/9/2021 下午6:22
 * @return
 */
public abstract class Promition {

    //定义一个计算优惠后的价格的算法
    public abstract double countPrice(int price);
}
