package com.brainbg.designpattern.adapter.commonCodeSimple;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/22
 *     desc   : 类适配器
 * </pre>
 */
public class Adapter extends ConcreteAdaptee implements Target {

    @Override
    public void targetMethod() {
        super.adapteeMethod();
    }

}
