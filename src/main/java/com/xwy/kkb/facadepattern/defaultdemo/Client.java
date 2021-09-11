package com.xwy.kkb.facadepattern.defaultdemo;

/**
 * @Classname Client
 * @Created by ��Ȼ
 * @Description �ͻ���
 */
public class Client {

    public static void main(String[] args) {

        //�ͻ���Ҫ�õ������豸�Ķ���
        Player player = Player.getInstance();

        Popcorn popcorn = Popcorn.getInstance();

        Projector projector = Projector.getInstance();

        Stereo stereo = Stereo.getInstance();

        popcorn.on();

        projector.on();

        stereo.on();//�Դ�����

        //.....
    }
}
