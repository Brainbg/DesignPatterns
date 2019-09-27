package com.brainbg.designpattern.proxy.cglib;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/27
 *     desc   :
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy(new Company());
        ICompany company = (ICompany) cglibProxy.getInstatnce();
        company.promotion();
        company.sale();
    }
}
