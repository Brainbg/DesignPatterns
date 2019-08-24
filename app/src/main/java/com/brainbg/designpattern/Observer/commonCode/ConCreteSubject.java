package com.brainbg.designpattern.Observer.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/24
 *     desc   : 具体被观察者
 * </pre>
 */
public class ConCreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        for (Observer observer : super.observers) {
            observer.updata();
        }
    }
}
