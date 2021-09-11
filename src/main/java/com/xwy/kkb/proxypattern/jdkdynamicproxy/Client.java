package com.xwy.kkb.proxypattern.jdkdynamicproxy;

/**
 * @Classname Client
 * @Created by 寂然
 * @Description 客户端
 */
public class Client {

    public static void main(String[] args) {

        //创建目标对象
        TargetTeacher targetTeacher = new TargetTeacher();

        //代理工厂
        ITeacher proxyInstance = (ITeacher) new ProxyFactory(targetTeacher).getProxyInstance();

        //class com.sun.proxy.$Proxy0 表示在内存中动态的生成了代理对象
        System.out.println(proxyInstance.getClass());

        proxyInstance.teach();
    }
}
