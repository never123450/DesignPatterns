package com.xwy.kkb.strategypattern.milkshopdemo3;

/**
 * @Classname Normal
 * @Created by 寂然
 * @Description 正常收费
 */
public class Normal extends Promition {

    @Override
    public int countPrice(int price) {

        //不打折
        return price;
    }
}
