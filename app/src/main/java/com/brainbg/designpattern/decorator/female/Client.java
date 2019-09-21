package com.brainbg.designpattern.decorator.female;

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

        Women women = new Women();

        LightMakeup lightMakeup = new LightMakeup(women);
        lightMakeup.primp();

        System.out.println("-------------------");

        HeavyMakeup heavyMakeup = new HeavyMakeup(women);
        heavyMakeup.primp();
    }
}
