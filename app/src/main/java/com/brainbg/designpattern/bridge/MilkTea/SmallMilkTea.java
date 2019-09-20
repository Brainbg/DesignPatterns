package com.brainbg.designpattern.bridge.MilkTea;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :
 * </pre>
 */
public class SmallMilkTea extends MilkTea {
    public SmallMilkTea(Flavor flavor) {
        super(flavor);
    }

    @Override
    public void makeMilkTea() {
        System.out.println("制作小杯" + flavor.addSomething() + "奶茶");
    }
}
