package com.brainbg.designpattern.proxy.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/25
 *     desc   : 真实主体
 * </pre>
 */
public class RealSubject implements Subject {
    /**
     * 业务逻辑具体实现
     */
    @Override
    public void operation() {
        System.out.println("真实主体的业务逻辑");
    }
}
