package com.xwy.kkb.proxypattern.cglibdynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @param
 * @author xwy
 * @Description 代理工厂
 * @date 14/9/2021 下午4:43
 * @return
 */
public class ProxyFactory implements MethodInterceptor {

    //维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //定义返回当前目标对象的代理对象的方法
    public Object getProxyInstance() {

        //创建一个工具类
        Enhancer enhancer = new Enhancer();

        //设置父类
        enhancer.setSuperclass(target.getClass());

        //设置回调函数
        enhancer.setCallback(this);

        //创建子类对象，即代理对象
        return enhancer.create();
    }

    //重写方法来实现对同名目标方法的调用
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("Cglib动态代理开始之前，添加业务逻辑XXXX");

        Object invoke = method.invoke(target, objects);

        System.out.println("Cglib动态代理执行之后，添加业务逻辑XXXX");

        return invoke;
    }
}
