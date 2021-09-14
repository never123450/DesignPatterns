package com.xwy.kkb.flyweightpattern.demo;

/**
 * @Description
 * @author xwy
 * @date 14/9/2021 上午11:26
 * @param
 * @return
 */
public class Test {

    public static void main(String[] args) {

//        Integer i = new Integer(100);
//
//        Integer j = new Integer(100);
//
//        System.out.println(i == j); //false

//        Integer i  = new Integer(100);
//
//        int j = 100;
//
//        System.out.println(i == j); //true

//        Integer i  = new Integer(100); //指向堆中新建的对象
//
//        Integer j = 100; //指向的是java常量池的对象
//
//        System.out.println(i == j); //false

        Integer i = 100; //池子里已经有了

        Integer j = 100;

        System.out.println(i == j); //?true

        Integer a = 129;

        Integer b = 129;

        System.out.println(a == b); //?false

        //java在编译Integer i = 100的时候，会翻译成
//        Integer i = Integer.valueOf(100); -128 - 127之间
    }
}
