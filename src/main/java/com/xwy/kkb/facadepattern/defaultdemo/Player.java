package com.xwy.kkb.facadepattern.defaultdemo;

/**
 * @Classname Player
 * @Created by 寂然
 * @Description 播放器
 */
public class Player {


    private static Player player = new Player();

    private Player(){}

    public static Player getInstance(){

        return player;
    }

    public void on(){
        System.out.println("打开播放器");
    }

    public void off(){
        System.out.println("关闭播放器");
    }

    public void play(){
        System.out.println("使用播放器播放电影");
    }

    public void pause(){
        System.out.println("暂停播放器");
    }

    public void select(){
        System.out.println("选择喜欢的电影");
    }


}
