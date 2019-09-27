package com.brainbg.designpattern.proxy.dynamicCommon;

import java.lang.reflect.InvocationHandler;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/26
 *     desc   :
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        DynamicProxyHandler proxyHandler = new DynamicProxyHandler();
        Subject subject = (Subject) proxyHandler.newProxyInstance(new RealSubject());
        subject.operation();
    }
}
