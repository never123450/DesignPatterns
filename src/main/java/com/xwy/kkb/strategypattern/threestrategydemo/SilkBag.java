package com.xwy.kkb.strategypattern.threestrategydemo;

/**
 * @param
 * @author xwy
 * @Description 妙计有了，需要一个锦囊
 * @date 14/9/2021 下午6:34
 * @return
 */
public class SilkBag {

    //聚合策略接口
    private IStragegy stragegy;

    public SilkBag(IStragegy stragegy) {
        this.stragegy = stragegy;
    }

    //使用锦囊里面的妙计
    public void operate() {
        this.stragegy.operate();
    }
}
