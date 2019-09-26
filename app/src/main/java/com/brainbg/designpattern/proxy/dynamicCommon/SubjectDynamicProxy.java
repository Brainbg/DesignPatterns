package com.brainbg.designpattern.proxy.dynamicCommon;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/26
 *     desc   :
 * </pre>
 */
public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(Subject subject) {
        //获得ClassLoader
        ClassLoader classLoader = subject.getClass().getClassLoader();
        //获的接口数组
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        //获取handler
        MyInvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(classLoader, interfaces, handler);
    }

}
