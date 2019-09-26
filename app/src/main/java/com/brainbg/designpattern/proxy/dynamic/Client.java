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
class Client {
    public static void main(String[] args) {
        ICompany company = new Company();
        InvocationHandler handler = new ProxyIH(company);
        ClassLoader classLoader = company.getClass().getClassLoader();
        ICompany proxy = (ICompany) Proxy.newProxyInstance(classLoader, new Class[]{ICompany.class}, handler);
        proxy.promotion();
        proxy.sale();

        System.out.println("-------------修改后--------------");

        InvocationHandler handler1 = new ProxyIH1(company);
        ClassLoader classLoader1 = company.getClass().getClassLoader();
        ICompany proxy1 = (ICompany) Proxy.newProxyInstance(classLoader1, new Class[]{ICompany.class}, handler1);
        proxy1.promotion();
        proxy1.sale();
    }
}
