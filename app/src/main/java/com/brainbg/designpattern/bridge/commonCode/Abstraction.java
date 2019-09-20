package com.brainbg.designpattern.bridge.commonCode;

/**
 * <pre>
 *     author : brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/18
 *     desc   :抽象者
 * </pre>
 */
abstract class Abstraction {
    protected Implementor mImplementor;

    /**
     * 通过实现部分对象的引用构造出抽象部分的对象。
     * 同时约束子类必须实现该构造函数
     *
     * @param mImplementor 引用实现部分的对象
     */
    public Abstraction(Implementor mImplementor) {
        this.mImplementor = mImplementor;
    }

    /**
     * 通过调用实现部分中的方法实现具体的功能。
     */
    public void operation() {
        this.mImplementor.operationImpl();
    }
}
