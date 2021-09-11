package com.xwy.kkb.adapterpattern.objectadapter;

/**
 * @Classname Client
 * @Created by 寂然
 * @Description 客户端
 */
public class Client {

    public static void main(String[] args) {

        new Iphone().Charding(new IphoneAdapter(new AC()));
    }
}
