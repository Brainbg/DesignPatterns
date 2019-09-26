package com.brainbg.designpattern.proxy.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/25
 *     desc   : 代理
 * </pre>
 */
public class Proxy implements Subject {
    private Subject subject;//持有一个主体对象的引用

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void operation() {
        this.subject.operation();
    }
}
