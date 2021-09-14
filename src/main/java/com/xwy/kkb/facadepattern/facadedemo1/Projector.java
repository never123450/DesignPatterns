package com.xwy.kkb.facadepattern.facadedemo1;

/**
 * @Description 投影仪
 * @author xwy
 * @date 14/9/2021 上午10:20
 * @param
 * @return
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
