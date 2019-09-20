package com.brainbg.designpattern.bridge.commonCode;

/**
 * <pre>
 *     author : brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/18
 *     desc   :抽象部分B
 * </pre>
 */
class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("抽象部分B具体实现");
    }
}
