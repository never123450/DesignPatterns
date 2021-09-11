package com.xwy.kkb.commandpattern.commanddemo;

/**
 * @Classname LightReceiver
 * @Created by 寂然
 * @Description 电灯命令接收者
 */
public class LightReceiver {

    public void on(){
        System.out.println("电灯已打开");
    }

    public void off(){
        System.out.println("电灯已关闭");
    }


}
