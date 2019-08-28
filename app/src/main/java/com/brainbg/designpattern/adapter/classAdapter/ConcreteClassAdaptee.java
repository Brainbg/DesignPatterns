package com.brainbg.designpattern.adapter.classAdapter;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/22
 *     desc   : 适配者具体实现
 * </pre>
 */
public class ConcreteClassAdaptee implements ClassAdaptee {
    @Override
    public String adapteeMethod() {
        return "适配者的数据";
    }
}
