package com.xwy.kkb.strategypattern.milkshopdemo3;

/**
 * @param
 * @author xwy
 * @Description 正常收费
 * @date 14/9/2021 下午6:21
 * @return
 */
public class Normal extends Promition {

    @Override
    public double countPrice(int price) {

        //不打折
        return price;
    }
}
