package com.brainbg.designpattern.observer.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/24
 *     desc   :观察者模式测试
 * </pre>
 */
public class ObserverTest {
    public static void main(String[] args) {
        Observer concreteObserver = new ConcreteObserver();
        Subject subject = new ConCreteSubject();
        subject.addObserver(concreteObserver);
        subject.notifyObserver();
    }
}
