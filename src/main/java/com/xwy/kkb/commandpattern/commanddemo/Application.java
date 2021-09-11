package com.xwy.kkb.commandpattern.commanddemo;

/**
 * @Classname Application
 * @Created by 寂然
 * @Description 操作智能家电的APP
 */
public class Application {

    //开操作的命令数组
    Command[] onCommands;

    Command[] offCommands;

    //执行撤销的命令
    //记住最近上一次执行的操作，然后撤销
    Command undoCommand;

    //构造器，完成对APP中 item 的初始化
    public Application(){

        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {

            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给item 设置你需要的命令
    public void setCommand(int number,Command onCommand,Command offCommand){

        onCommands[number] = onCommand;

        offCommands[number] = offCommand;

    }

    //点击里面的开启位置
    public void onItem(int number){

        //找到你点击的开启位置（第几组），并调用对应的方法
        onCommands[number].execute();
        //记录本次操作，用于撤销
        undoCommand = onCommands[number];

    }

    //按下里面的关闭位置
    public void offItem(int number){

        //找到你点击的关闭位置（第几组），并调用对应的方法
        offCommands[number].execute();
        //记录本次操作，用于撤销
        undoCommand = offCommands[number];

    }

    //点击撤销位置
    public void undoItem(){

        undoCommand.undo();
    }

}
