package com.xwy.proxy.custom;

import java.lang.reflect.Method;

/**
 * @author xwy
 * @date 2021/3/14
 * @param
 * @return
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
