package com.xwy.kkb.strategypattern.threestrategydemo;

/**
 * @Classname GreenLight
 * @Created by 寂然
 * @Description 找吴国太帮忙，开个绿灯
 */
public class GreenLight implements IStragegy{

    @Override
    public void operate() {

        System.out.println("找吴国太帮忙，开个绿灯");
    }
}
