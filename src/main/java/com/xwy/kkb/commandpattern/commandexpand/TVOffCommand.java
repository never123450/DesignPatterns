package com.xwy.kkb.commandpattern.commandexpand;

/**
 * @Classname TVOffCommand
 * @Created by 寂然
 * @Description 电视机关闭命令
 */
public class TVOffCommand implements Command {

    //聚合TVReceiver
    private TVReceiver tvReceiver;

    //构造器
    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }


    @Override
    public void execute() {
        tvReceiver.offTV();
    }

    @Override
    public void undo() {

        tvReceiver.onTV();
    }
}
