package com.xwy.kkb.commandpattern.commandexpand;

/**
 * @Classname Client
 * @Created by 寂然
 * @Description 客户端
 */
public class Client {

    public static void main(String[] args) {

        //使用命令模式，完成APP上对电视的操作

        //创建电灯的对象
        TVReceiver tvReceiver = new TVReceiver();

        //创建电灯相关的开关命令
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);

        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        //需要一个APP
        Application application = new Application();

        //给APP界面上设计相关命令
        //例如 number = 0 是电灯的开关操作
        application.setCommand(0,tvOnCommand,tvOffCommand);

        //测试
        System.out.println("按下APP中打开电视的位置");

        application.onItem(0);

        System.out.println("按下APP中关闭电视的位置");

        application.offItem(0);

        System.out.println("撤销上一次操作");

        application.undoItem();

    }
}
