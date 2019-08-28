package com.brainbg.designpattern.factoryMethod.chan;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail
 *     time   : 2019/08/20
 *     desc   :
 * </pre>
 */
public class NvWa {

    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();
        System.out.println("---------------白种人-----------");
        WhiteHuman whiteHuman = factory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talck();

        System.out.println("---------------黑种人-----------");
        BlackHuman blackHuman = factory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talck();

        System.out.println("---------------黄种人-----------");
        YellowHuman yellowHuman = factory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talck();
    }
}
