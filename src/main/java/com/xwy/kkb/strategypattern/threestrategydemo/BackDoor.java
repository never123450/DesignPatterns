package com.xwy.kkb.strategypattern.threestrategydemo;

/**
 * @param
 * @author xwy
 * @Description 找乔国老帮忙，开后门
 * @date 14/9/2021 下午6:34
 * @return
 */
public class BackDoor implements IStragegy {

    @Override
    public void operate() {
        System.out.println("开后门，找乔国老，给孙权施加舆论压力");
    }
}
