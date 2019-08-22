package com.brainbg.designpattern.factoryMethod.chan;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail
 *     time   : 2019/08/20
 *     desc   :黄色人种
 * </pre>
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.print("黄色人种的皮肤颜色是黄色的！");
    }

    @Override
    public void talck() {
        System.out.print("黄色人会说话，一般说的都是双字节！");
    }
}
