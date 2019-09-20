package com.brainbg.designpattern.bridge.MilkTea;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :
 * </pre>
 */
public class OriginalFlavor implements Flavor {
    @Override
    public String addSomething() {
        return "原味";
    }
}
