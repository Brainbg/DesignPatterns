package com.brainbg.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/27
 *     desc   :
 * </pre>
 */
public class CglibProxy implements MethodInterceptor {
    private Object object;

    public CglibProxy(Object object) {
        this.object = object;
    }

    public Object getInstatnce() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object invoke = methodProxy.invokeSuper(object, args);
        if (method.getName().equalsIgnoreCase("promotion")) {
            System.out.println("加大力度推广产品！");
        }
        if (method.getName().equalsIgnoreCase("sale")) {
            System.out.println("销售额有所提高！");
        }
        return invoke;
    }
}
