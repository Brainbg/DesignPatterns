package com.brainbg.designpattern.observer.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/24
 *     desc   :观察者模式测试
 * </pre>
 */
class Test {
    public static void main(String[] args) {
        Observer concreteObserver = new ConcreteObserver();
        Observer concreteObserver1 = new ConcreteObserver();

        Subject subject = new ConcreteSubject();

        subject.addObserver(concreteObserver);
        subject.addObserver(concreteObserver1);

        subject.notifyObserver();
    }
}
