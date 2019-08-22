package com.brainbg.designpattern.factoryMethod.chan;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail
 *     time   : 2019/08/20
 *     desc   :黑色人种
 * </pre>
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }

    @Override
    public void talck() {
        System.out.println("黑色人会说话，一般人听不懂！");
    }
}
