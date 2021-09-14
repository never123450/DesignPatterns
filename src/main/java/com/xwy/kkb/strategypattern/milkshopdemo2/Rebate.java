package com.xwy.kkb.strategypattern.milkshopdemo2;

/**
 * @param
 * @author xwy
 * @Description 返利促销（满减促销）
 * @date 14/9/2021 下午6:02
 * @return
 */
public class Rebate extends Promition {

    //返利收费初始化的时候需要输入返利条件，返利值
    @Override
    public int countPrice(int price) {
        //省略
        return 0;
    }
}
