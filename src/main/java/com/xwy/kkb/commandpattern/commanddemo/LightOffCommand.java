package com.xwy.kkb.commandpattern.commanddemo;

/**
 * @Classname LightOffCommand
 * @Created by 寂然
 * @Description I walk very slowly, but I never walk backwards
 */
public class LightOffCommand implements Command {

    //聚合LightReceiver
    private LightReceiver lightReceiver;

    //构造器
    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        lightReceiver.off();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        lightReceiver.on();

    }
}
