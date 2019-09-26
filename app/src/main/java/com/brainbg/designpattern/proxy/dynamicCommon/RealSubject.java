package com.brainbg.designpattern.proxy.dynamicCommon;


/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/26
 *     desc   :
 * </pre>
 */
public class RealSubject implements Subject {
    @Override
    public void operation() {
        System.out.println("真实主体业务逻辑");
    }
}
