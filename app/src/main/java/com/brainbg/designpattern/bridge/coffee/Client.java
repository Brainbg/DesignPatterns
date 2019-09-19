package com.brainbg.designpattern.bridge.coffee;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/19
 *     desc   :
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Ordinary ordinary = new Ordinary();
        Sugar sugar = new Sugar();

        LargeCoffee largeOrdinaryCoffee = new LargeCoffee(ordinary);
        largeOrdinaryCoffee.makeCoffee();
        LargeCoffee largeSugarCoffee = new LargeCoffee(sugar);
        largeSugarCoffee.makeCoffee();

        SmallCoffee smallOrdinaryCoffee = new SmallCoffee(ordinary);
        smallOrdinaryCoffee.makeCoffee();
        SmallCoffee smallSugarCoffee = new SmallCoffee(sugar);
        smallSugarCoffee.makeCoffee();

        MiddleCoffee middleOrdinaryCoffee = new MiddleCoffee(ordinary);
        middleOrdinaryCoffee.makeCoffee();
        MiddleCoffee middleSugarCoffee = new MiddleCoffee(sugar);
        middleSugarCoffee.makeCoffee();

    }
}
