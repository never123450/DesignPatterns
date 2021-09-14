package com.xwy.kkb.proxypattern.cglibdynamicproxy;

/**
 * @param
 * @author xwy
 * @Description 客户端
 * <p>
 * 动态代理-Cglib动态代理
 * 静态代理&JDK动态代理也好，都要求目标对象实现接口，但是有时候目标对象只是一个单独的对象，并没有实现接口，
 * 基于这样的情况，我们可以使用目标对象的子类来完成代理，这就是Cglib动态代理
 * <p>
 * 基本介绍
 * cglib代理也叫作子类代理，他是在内存中构件一个子类对象，从而实现对目标对象的功能扩展
 * 使用Cglib动态代理，目标对象无须实现任何的接口(使用的时候要引入Cglib相关的依赖)
 * <p>
 * 模式总结优势
 * 代理模式在客户端和目标对象之间起到了一个中介作用和保护目标对象的作用
 * 代理对象可以扩展目标对象的功能和业务逻辑，增强目标对象
 * 代理模式可以将客户端与目标对象分离，在一定程度上降低了系统的耦合度
 * 局限性
 * 请求要经过代理对象，会导致请求处理速度变慢
 * 无疑会增加系统的复杂度，因为可能有大量的代理对象产生
 * <p>
 * 使用场景
 * 防火墙代理
 * 缓存代理
 * 远程代理
 * 虚拟代理
 * 智能指引
 * <p>
 * @date 14/9/2021 下午4:44
 * @return
 */
public class Client {

    public static void main(String[] args) {

        //创建目标对象
        TargetTeacher targetTeacher = new TargetTeacher();

        //获取代理对象
        TargetTeacher proxyInstance = (TargetTeacher) new ProxyFactory(targetTeacher).getProxyInstance();

        //使用代理类调用方法
        proxyInstance.teach();
    }
}
