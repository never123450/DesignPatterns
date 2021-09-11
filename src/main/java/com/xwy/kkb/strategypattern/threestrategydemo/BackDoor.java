package com.xwy.kkb.strategypattern.threestrategydemo;

/**
 * @Classname BackDoor
 * @Created by 寂然
 * @Description 找乔国老帮忙，开后门
 */
public class BackDoor implements IStragegy{

    @Override
    public void operate() {
        System.out.println("开后门，找乔国老，给孙权施加舆论压力");
    }
}
