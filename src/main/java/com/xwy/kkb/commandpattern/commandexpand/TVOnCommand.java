package com.xwy.kkb.commandpattern.commandexpand;

/**
 * @Classname TVOnCommand
 * @Created by 寂然
 * @Description 电视机打开命令
 */
public class TVOnCommand implements Command {

    //聚合TVReceiver
    private TVReceiver tvReceiver;

    //构造器
    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }


    @Override
    public void execute() {
        tvReceiver.onTV();
    }

    @Override
    public void undo() {

        tvReceiver.offTV();
    }
}
