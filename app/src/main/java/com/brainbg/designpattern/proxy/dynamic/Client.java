package com.brainbg.designpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

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
        DynamicProxy dynamicProxy = new DynamicProxy(new Company());
        ICompany company = (ICompany) dynamicProxy.newProxyInstance();
        company.promotion();
        company.sale();
    }
}
