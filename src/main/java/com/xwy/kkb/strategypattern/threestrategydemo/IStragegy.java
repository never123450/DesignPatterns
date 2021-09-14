package com.xwy.kkb.strategypattern.threestrategydemo;

/**
 * @param
 * @author xwy
 * @Description 抽象策略类
 * @date 14/9/2021 下午6:34
 * @return
 */
public interface IStragegy {

    // 每个锦囊妙计都是一个可执行的算法/操作
    public void operate();
}
