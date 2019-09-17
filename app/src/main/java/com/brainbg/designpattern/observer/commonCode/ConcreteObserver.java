package com.brainbg.designpattern.observer.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/24
 *     desc   : 具体观察者
 * </pre>
 */
 class ConcreteObserver implements Observer {
    @Override
    public void updata() {
        //具体的业务逻辑
        System.out.println("收到来自被观察的更新！");
    }
}
