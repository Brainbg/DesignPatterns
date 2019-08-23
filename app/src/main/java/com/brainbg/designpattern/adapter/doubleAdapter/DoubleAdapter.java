package com.brainbg.designpattern.adapter.doubleAdapter;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/23
 *     desc   : 双向适配器
 * </pre>
 */
public class DoubleAdapter implements DoubleTarget, DoubleAdaptee {
    private DoubleAdaptee adaptee;
    private DoubleTarget target;

    /**
     * 通过构造方法传入具体的目标实例
     *
     * @param target 具体目标的实例
     */
    public DoubleAdapter(DoubleTarget target) {
        this.target = target;
    }

    /**
     * 通过构造方法传入具体的适配者实例
     *
     * @param adaptee 适配者实例
     */
    public DoubleAdapter(DoubleAdaptee adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void targetMethod() {
        //业务逻辑
        this.adaptee.adapteeMethod();
    }

    @Override
    public void adapteeMethod() {
        this.target.targetMethod();
    }
}
