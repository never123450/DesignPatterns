package com.xwy.kkb.strategypattern.threestrategydemo;

/**
 * @param
 * @author xwy
 * @Description 找老婆帮忙，让孙夫人喝退追兵
 * @date 14/9/2021 下午6:33
 * @return
 */
public class WifeHelp implements IStragegy {

    @Override
    public void operate() {
        System.out.println("找老婆帮忙，让孙夫人喝退追兵");
    }
}
