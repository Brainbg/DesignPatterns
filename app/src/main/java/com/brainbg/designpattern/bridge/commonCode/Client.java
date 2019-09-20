package com.brainbg.designpattern.bridge.commonCode;

/**
 * <pre>
 *     author : brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/18
 *     desc   :客户类
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        ConcreteImplementorA concreteImplementorA = new ConcreteImplementorA();
        Abstraction abstractionA = new RefinedAbstraction(concreteImplementorA);
        abstractionA.operation();

        ConcreteImplementorB concreteImplementorB = new ConcreteImplementorB();
        Abstraction abstractionB = new RefinedAbstraction(concreteImplementorB);
        abstractionB.operation();
    }
}
