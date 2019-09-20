package com.brainbg.designpattern.bridge.MilkTea;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :
 * </pre>
 */
public class MiddleMilkTea extends MilkTea {
    public MiddleMilkTea(Flavor flavor) {
        super(flavor);
    }

    @Override
    public void makeMilkTea() {
        System.out.println("制作中杯"+flavor.addSomething()+"奶茶");
    }
}
