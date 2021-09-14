package com.xwy.kkb.strategypattern.threestrategydemo;

/**
 * @param
 * @author xwy
 * @Description 找吴国太帮忙，开个绿灯
 * @date 14/9/2021 下午6:34
 * @return
 */
public class GreenLight implements IStragegy {

    @Override
    public void operate() {

        System.out.println("找吴国太帮忙，开个绿灯");
    }
}
