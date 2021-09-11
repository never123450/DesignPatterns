package com.xwy.kkb.facadepattern.defaultdemo;

/**
 * @Classname Projector
 * @Created by 寂然
 * @Description 投影仪
 */
public class Projector {

    private static Projector projector = new Projector();

    private Projector(){}

    public static Projector getInstance(){

        return projector;
    }

    public void on(){
        System.out.println("放下屏幕，打开投影仪");
    }

    public void off(){
        System.out.println("关闭投影仪");
    }

    public void focus(){
        System.out.println("调节投影仪焦距");
    }

    public void zoom(){
        System.out.println("投影仪变焦");
    }

}
