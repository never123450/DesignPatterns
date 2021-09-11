package com.xwy.kkb.adapterpattern.classadapter;

/**
 * @Classname Client
 * @Created by 寂然
 * @Description 客户端
 */
public class Client {

    public static void main(String[] args) {

        new Iphone().charding(new IphoneAdapter());
    }
}
