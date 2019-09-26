package com.brainbg.designpattern.proxy.dynamic;

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
public class ProxyIH implements InvocationHandler {
    private Object objcet;

    public ProxyIH(Object objcet) {
        this.objcet = objcet;
    }

    /**
     * 调用被代理的方法
     *
     * @param proxy  代理
     * @param method 方法
     * @param args   参数
     * @return 返回
     * @throws Throwable 抛出异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.objcet, args);
    }

}
