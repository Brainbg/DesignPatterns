package com.brainbg.designpattern.bridge.MilkTea;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :口味
 * </pre>
 */
public interface Flavor {
    /**
     * 自行添加所需要的口味
     *
     * @return 添加材料内容
     */
    public String addSomething();
}
