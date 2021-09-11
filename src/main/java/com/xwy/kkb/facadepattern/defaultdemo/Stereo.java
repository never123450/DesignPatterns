package com.xwy.kkb.facadepattern.defaultdemo;

/**
 * @Classname Stereo
 * @Created by 寂然
 * @Description 音响
 */
public class Stereo {

    private static Stereo stereo = new Stereo();

    private Stereo(){}

    public static Stereo getInstance(){
        return stereo;
    }

    public void on(){
        System.out.println("打开音响");
    }

    public void off(){
        System.out.println("关闭音响");
    }

    public void setVolume(){
        System.out.println("调节音响音量");
    }

}
