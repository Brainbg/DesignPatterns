package com.brainbg.designpattern.bridge.coffee;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/19
 *     desc   :
 * </pre>
 */
public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯" + impl.addSomething() + "咖啡");
    }
}
