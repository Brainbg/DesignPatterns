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
public class ProxyIH1 implements InvocationHandler {
    private Object objcet;

    public ProxyIH1(Object objcet) {
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
        Object invoke = method.invoke(this.objcet, args);
        if(method.getName().equalsIgnoreCase("promotion")){
            System.out.println("加大力度推广产品！");
        }
        if(method.getName().equalsIgnoreCase("sale")){
            System.out.println("销售额有所提高！");
        }
        return invoke;
    }
}
