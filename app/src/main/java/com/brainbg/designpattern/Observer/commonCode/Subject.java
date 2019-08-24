package com.brainbg.designpattern.Observer.commonCode;

import java.util.ArrayList;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/24
 *     desc   : 被观察者
 * </pre>
 */
public abstract class Subject {
    protected ArrayList<Observer> observers = new ArrayList<>();

    /**
     * 添加观察者
     *
     * @param observer 观察者实例
     */
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer 观察者实例
     */
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    public abstract void notifyObserver();
}
