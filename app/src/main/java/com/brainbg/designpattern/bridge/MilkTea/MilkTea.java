package com.brainbg.designpattern.bridge.MilkTea;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :
 * </pre>
 */
public abstract class MilkTea {
    protected Flavor flavor;

    /**
     * 约束子类必须实现该构造函数
     *
     * @param flavor 传入第二个维度构建桥梁
     */
    public MilkTea(Flavor flavor) {
        this.flavor = flavor;
    }

    /**
     * 奶茶的制作流程交给子类实现
     */
    public abstract void makeMilkTea();
}

