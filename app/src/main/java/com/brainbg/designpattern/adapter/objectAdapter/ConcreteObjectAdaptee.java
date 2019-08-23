package com.brainbg.designpattern.adapter.objectAdapter;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/23
 *     desc   :适配者具体实现
 * </pre>
 */
public class ConcreteObjectAdaptee implements ObjectAdaptee {
    @Override
    public String adapteeMethod() {
        return "适配者的数据";
    }
}
