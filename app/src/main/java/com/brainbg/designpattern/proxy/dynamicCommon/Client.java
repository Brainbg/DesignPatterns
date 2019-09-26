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
        Subject subject = new RealSubject();

        InvocationHandler handler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        proxy.operation();

        System.out.println("-------封装后-------");
        Subject proxy1 = SubjectDynamicProxy.newProxyInstance(subject);
        proxy1.operation();


    }
}
