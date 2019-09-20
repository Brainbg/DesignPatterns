package com.brainbg.designpattern.bridge.MilkTea;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :
 * </pre>
 */
public class LargeMilkTea extends MilkTea {
    public LargeMilkTea(Flavor flavor) {
        super(flavor);
    }

    @Override
    public void makeMilkTea() {
        System.out.println("制作大杯"+flavor.addSomething()+"奶茶");
    }
}
