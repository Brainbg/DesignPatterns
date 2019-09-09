package com.brainbg.designpattern.Strategy.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/26
 *     desc   :
 * </pre>
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomethings() {
        this.strategy.operate();
    }
}
