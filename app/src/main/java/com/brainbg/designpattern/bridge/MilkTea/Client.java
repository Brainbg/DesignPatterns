package com.brainbg.designpattern.bridge.MilkTea;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        //类型：大杯、中杯、小杯
        //口味：水果味、原味、奶盖
        FruitFlavor fruitFlavor = new FruitFlavor();
        OriginalFlavor originalFlavor = new OriginalFlavor();
        CapFlavor capFlavor = new CapFlavor();

        LargeMilkTea largeFruitMilkTea = new LargeMilkTea(fruitFlavor);
        largeFruitMilkTea.makeMilkTea();
        SmallMilkTea smallFruitMilkTea = new SmallMilkTea(fruitFlavor);
        smallFruitMilkTea.makeMilkTea();
        MiddleMilkTea middleFruitMilkTea = new MiddleMilkTea(fruitFlavor);
        middleFruitMilkTea.makeMilkTea();

        LargeMilkTea largeOriginalMilkTea = new LargeMilkTea(originalFlavor);
        largeOriginalMilkTea.makeMilkTea();
        SmallMilkTea smallOriginalMilkTea = new SmallMilkTea(originalFlavor);
        smallOriginalMilkTea.makeMilkTea();
        MiddleMilkTea middleOriginalMilkTea = new MiddleMilkTea(originalFlavor);
        middleOriginalMilkTea.makeMilkTea();

        LargeMilkTea largeCapMilkTea = new LargeMilkTea(capFlavor);
        largeCapMilkTea.makeMilkTea();
        SmallMilkTea smallCapMilkTea = new SmallMilkTea(capFlavor);
        smallCapMilkTea.makeMilkTea();
        MiddleMilkTea middleCapMilkTea = new MiddleMilkTea(capFlavor);
        middleCapMilkTea.makeMilkTea();
    }
}
