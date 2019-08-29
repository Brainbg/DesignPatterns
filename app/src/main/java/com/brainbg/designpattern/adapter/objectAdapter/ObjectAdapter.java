package com.brainbg.designpattern.adapter.objectAdapter;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/23
 *     desc   : 对象适配器
 * </pre>
 */
public class ObjectAdapter implements ObjectTarget {
    private ObjectAdaptee adaptee;

    /**
     * 通过构造方法传入具体的适配者实例
     *
     * @param adaptee 适配者实例
     */
    public ObjectAdapter(ObjectAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void targetMethod() {
        //业务逻辑
        this.adaptee.adapteeMethod();
    }
}
