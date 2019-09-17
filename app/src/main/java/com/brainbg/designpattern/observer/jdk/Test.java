package com.brainbg.designpattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/24
 *     desc   :观察者模式测试
 * </pre>
 */
public class Test {

    public static void main(String[] args) {
        Observer concreteObserver = new ConcreteObserver();

        Observable subject = new ConCreteSubject();
        subject.addObserver(concreteObserver);
        subject.notifyObservers();
    }
}
