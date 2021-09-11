package com.xwy.kkb.proxypattern.cglibdynamicproxy;

/**
 * @Classname Client
 * @Created by 寂然
 * @Description 客户端
 */
public class Client {

    public static void main(String[] args) {

        //创建目标对象
        TargetTeacher targetTeacher = new TargetTeacher();

        //获取代理对象
        TargetTeacher proxyInstance = (TargetTeacher)new ProxyFactory(targetTeacher).getProxyInstance();

        //使用代理类调用方法
        proxyInstance.teach();
    }
}
