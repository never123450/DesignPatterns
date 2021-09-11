package com.xwy.kkb.commandpattern.commanddemo;

/**
 * @Classname Command
 * @Created by 寂然
 * @Description 命令接口
 */
public interface Command {

    //执行动作
    public void execute();

    //撤销动作
    public void undo();
}
