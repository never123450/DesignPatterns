package com.xwy.kkb.commandpattern.commanddemo;

/**
 * @Classname Client
 * @Created by 寂然
 * @Description 客户端
 */
public class Client {

    public static void main(String[] args) {

        //使用命令模式，完成APP上对智能家电的操作

        //创建电灯的对象
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);

        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个APP
        Application application = new Application();

        //给APP界面上设计相关命令
        //例如 number = 1 是电视的开关操作
        application.setCommand(1,lightOnCommand,lightOffCommand);

        //测试
        System.out.println("按下APP中开灯的位置");

        application.onItem(1);

        System.out.println("按下APP中关灯的位置");

        application.offItem(1);

        System.out.println("撤销上一次操作");

        application.undoItem();

    }
}
