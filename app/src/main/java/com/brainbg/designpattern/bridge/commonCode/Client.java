package com.brainbg.designpattern.bridge.commonCode;

/**
 * <pre>
 *     author : brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/18
 *     desc   :
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Implementor imp = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(imp);
        abstraction.reques();
    }
}
