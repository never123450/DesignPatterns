package com.xwy.kkb.strategypattern.threestrategydemo;

/**
 * @Classname WifeHelp
 * @Created by 寂然
 * @Description 找老婆帮忙，让孙夫人喝退追兵
 */
public class WifeHelp implements IStragegy{


    @Override
    public void operate() {
        System.out.println("找老婆帮忙，让孙夫人喝退追兵");
    }
}
