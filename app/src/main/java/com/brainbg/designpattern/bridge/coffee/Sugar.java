package com.brainbg.designpattern.bridge.coffee;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/19
 *     desc   :
 * </pre>
 */
public class Sugar extends CoffeeAdditives {
    @Override
    public String addSomething() {
        return "加糖";
    }
}
