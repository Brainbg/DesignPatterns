package com.brainbg.designpattern.proxy.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/25
 *     desc   :
 * </pre>
 */
public class Proxy implements Subject {
    private Subject subject;

    public Proxy() {
        this.subject = new Proxy();
    }

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void operation() {
        this.subject.operation();
    }
}
