package com.brainbg.designpattern.proxy.dynamicCommon;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/26
 *     desc   :动态代理
 * </pre>
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        //寻找JoinPoint 连接点，AOP 框架使用元数据定义
        if (true) {
            //执行一个前置通知
            new BeforeAdvice().exec();
        }
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
