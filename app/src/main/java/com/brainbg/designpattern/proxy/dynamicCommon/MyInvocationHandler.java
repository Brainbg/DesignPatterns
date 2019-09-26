package com.brainbg.designpattern.proxy.dynamicCommon;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/26
 *     desc   :
 * </pre>
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(this.object, args);
        if (method.getName().equalsIgnoreCase("operation")) {
            System.out.println("新增业务逻辑！");
        }
        return invoke;
    }
}
