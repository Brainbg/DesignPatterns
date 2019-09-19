package com.brainbg.designpattern.bridge.coffee;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/19
 *     desc   :
 * </pre>
 */
public abstract class Coffee {
    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }
    public  abstract void makeCoffee();
}
