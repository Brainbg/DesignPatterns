package com.brainbg.designpattern.proxy.dynamicCommon;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/26
 *     desc   :
 * </pre>
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object object;

    public Object newProxyInstance(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(this.object, args);
        //获取真实主体的方法
        if (method.getName().equalsIgnoreCase("operation")) {
            System.out.println("新增业务逻辑！");
        }
        return invoke;
    }
}
