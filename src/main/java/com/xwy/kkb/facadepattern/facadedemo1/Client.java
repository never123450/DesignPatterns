package com.xwy.kkb.facadepattern.facadedemo1;

/**
 * @Classname Client
 * @Created by ��Ȼ
 * @Description I walk very slowly, but I never walk backwards
 */
public class Client {

    public static void main(String[] args) {

        //ʹ�����ģʽ
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.ready();

        homeTheaterFacade.play();

        homeTheaterFacade.end();
    }
}
