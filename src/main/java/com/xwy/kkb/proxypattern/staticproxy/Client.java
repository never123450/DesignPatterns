package com.xwy.kkb.proxypattern.staticproxy;

/**
 * @param
 * @author xwy
 * @Description 客户端
 * 基本介绍
 * 代理模式(Proxy Parttern)
 * 为一个对象提供一个替身，来控制这个对象的访问，即通过代理对象来访问目标对象，
 * 这样做的话好处是可以在目标对象实现的基础上，进行额外的功能的扩展
 * <p>
 * 角色分析：
 * Subject：抽象类，代理类和目标类共同实现的接口或者共有的父类
 * RealSubject：真实类，其实就是目标类，实现了抽象类的具体业务逻辑，是代理对象所代理的目标对象，也是最终要引用的对象
 * Proxy：代理类，实现了与目标类相同的接口或者与目标类拥有共同的父类，代理类的内部包含对目标对象的引用，就可以控制，访问，或者扩展目标对象的功能
 * <p>
 * 模式分类
 * 静态代理&动态代理
 * 动态代理又有两种:JDK动态代理，cglib代理
 * 静态代理
 * 静态代理使用时需要定义接口或者父类
 * 所谓静态，就是代理类和被代理类(目标类)的关系在运行前就已经确定了
 * 优势
 * 静态代理模式可以在不改变目标对象功能的前提下，通过代理对象对目标对象功能进行扩展
 * <p>
 * 劣势
 * 这样可能不利于程序的扩展，因为需要实现一样的接口或者有共同的父类，那这样一个代理类只能为一个或者一组
 * 接口服务，这样的话，项目大了程序开发中会产生大量的代理类
 * 一旦接口增加方法，目标对象和代理对象都要维护
 *
 *
 * 动态代理-JDK动态代理什么是动态代理?
 * 既然是动态就区别与静态，动态代理指的是，代理类和目标类的关系在程序运行的时候确定的
 * 动态代理是指客户通过代理类来调用目标对象的方法，是在程序运行时根据需要动态的创建目标类的代理对象
 *
 * 问题思考
 * 问题一:如何根据加载到内存中的目标类，动态的创建代理类的对象呢?
 *
 * 问题二:当通过代理类的对象调用方法的时候，如何动态的调用目标类的同名方法?
 *
 *
 * @date 14/9/2021 下午3:33
 * @return
 */
public class Client {

    public static void main(String[] args) {
        TargetTeacher targetTeacher = new TargetTeacher();
        new ProxyTeacher(targetTeacher).teach();
    }
}
