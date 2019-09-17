package com.brainbg.designpattern.observer.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/24
 *     desc   : 具体被观察者
 * </pre>
 */
class ConcreteSubject extends Subject {

    @Override
    public void notifyObserver() {
        for (Observer observer : super.observers) {
            observer.updata();
        }
    }
}
