package com.xwy.kkb.adapterpattern.interfaceadapter;

/**
 * @Classname Client
 * @Created by 寂然
 * @Description 客户端
 */
public class Client {

    public static void main(String[] args) {

        IphoneAdapter iphoneAdapter = new IphoneAdapter(new AC());

        int targetV = iphoneAdapter.output5V();

        System.out.println("手机成功冲上电了，现在的电压是" + targetV);

    }
}
