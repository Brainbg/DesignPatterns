package com.brainbg.designpattern.bridge.commonCode;

/**
 * <pre>
 *     author : brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/18
 *     desc   :抽象部分A
 * </pre>
 */
class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("抽象部分A具体实现");
    }
}
