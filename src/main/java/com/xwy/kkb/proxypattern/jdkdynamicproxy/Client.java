package com.xwy.kkb.proxypattern.jdkdynamicproxy;

/**
 * @param
 * @author xwy
 * @Description 客户端
 * <p>
 * 动态代理-JDK动态代理什么是动态代理?
 * 既然是动态就区别与静态，动态代理指的是，代理类和目标类的关系在程序运行的时候确定的
 * 动态代理是指客户通过代理类来调用目标对象的方法，是在程序运行时根据需要动态的创建目标类的代理对象
 * <p>
 * 问题思考
 * 问题一:如何根据加载到内存中的目标类，动态的创建代理类的对象呢?
 *
 * <p>
 * 问题二:当通过代理类的对象调用方法的时候，如何动态的调用目标类的同名方法?
 * @date 14/9/2021 下午4:17
 * @return
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
