package com.xwy.kkb.commandpattern.commandexpand;

/**
 * @Classname TVReceiver
 * @Created by 寂然
 * @Description 电视命令接收者
 */
public class TVReceiver {

    public void onTV(){
        System.out.println("电视已打开");
    }

    public void offTV(){
        System.out.println("电视已关闭");
    }
}
