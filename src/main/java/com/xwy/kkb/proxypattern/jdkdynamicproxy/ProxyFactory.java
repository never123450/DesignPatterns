package com.xwy.kkb.proxypattern.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @param
 * @author xwy
 * @Description 动态代理模式中的代理工厂
 * @date 14/9/2021 下午4:22
 * @return
 */
public class ProxyFactory {

    //维护一个目标对象target
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //动态的给目标对象生成代理对象
//   ClassLoader loader, 指定我们当前目标对象使用的类加载器，那获取类加载器的方法其实是固定的
//   @NotNull Class<?>[] interfaces,目标对象实现的接口类型，使用了泛型方法来确认类型
//   @NotNull reflect.InvocationHandler h  事件处理，执行目标对象的方法的时候，回来触发事件处理的方法
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK动态代理开始之前，添加业务逻辑XXX");
                        //使用反射机制来调用目标对象的方法:解决了问题二
                        Object invoke = method.invoke(target, args);
                        System.out.println("JDK动态代理结束之后，添加业务逻辑XXX");
                        return invoke;
                    }
                });
    }
}
