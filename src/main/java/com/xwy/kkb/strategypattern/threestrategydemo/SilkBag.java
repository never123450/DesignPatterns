package com.xwy.kkb.strategypattern.threestrategydemo;

/**
 * @Classname SilkBag
 * @Created by 寂然
 * @Description 妙计有了，需要一个锦囊
 */
public class SilkBag {

    //聚合策略接口
    private IStragegy stragegy;

    public SilkBag(IStragegy stragegy) {
        this.stragegy = stragegy;
    }


    //使用锦囊里面的妙计
    public void operate(){

        this.stragegy.operate();
    }
}
