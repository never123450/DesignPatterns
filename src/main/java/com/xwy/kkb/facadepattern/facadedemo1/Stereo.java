package com.xwy.kkb.facadepattern.facadedemo1;

/**
 * @Description 音响
 * @author xwy
 * @date 14/9/2021 上午10:20
 * @param
 * @return
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
