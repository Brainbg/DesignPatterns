package com.brainbg.designpattern.proxy.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/25
 *     desc   :客户类
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.operation();
    }
}
