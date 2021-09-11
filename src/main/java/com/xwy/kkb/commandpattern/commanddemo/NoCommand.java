package com.xwy.kkb.commandpattern.commanddemo;

/**
 * @Classname NoCommand
 * @Created by 寂然
 * @Description 没有任何命令，即空执行，用于初始化APP上每个item
 *  当调用空命令时，对象什么都不做，其实这也是一种设计模式，可以省略掉对空的判断
 */
public class NoCommand implements Command {


    @Override
    public void execute() {

        //TODO...
    }

    @Override
    public void undo() {

        //TODO...
    }
}
