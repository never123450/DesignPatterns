package com.xwy.kkb.proxypattern.staticproxy;

/**
 * @Classname Client
 * @Created by 寂然
 * @Description 客户端
 */
public class Client {

    public static void main(String[] args) {

        TargetTeacher targetTeacher = new TargetTeacher();

        new ProxyTeacher(targetTeacher).teach();
    }
}
