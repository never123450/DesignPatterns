package com.xwy.kkb.commandpattern.commanddemo;

/**
 * @Classname LightOnCommand
 * @Created by 寂然
 * @Description I walk very slowly, but I never walk backwards
 */
public class LightOnCommand implements Command {

    //聚合LightReceiver
    private LightReceiver lightReceiver;

    //构造器
    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        lightReceiver.on();

    }

    @Override
    public void undo() {
        //调用接收者的方法
        lightReceiver.off();

    }
}
