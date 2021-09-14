package com.xwy.kkb.facadepattern.defaultdemo;

/**
 * @Description 客户端
 * @author xwy
 * @date 14/9/2021 上午10:01
 * @param
 * @return
 */
public class Client {

    public static void main(String[] args) {

        //客户端要拿到各个设备的对象
        Player player = Player.getInstance();

        Popcorn popcorn = Popcorn.getInstance();

        Projector projector = Projector.getInstance();

        Stereo stereo = Stereo.getInstance();

        popcorn.on();

        projector.on();

        stereo.on();//以此类推

        //.....
    }
}
