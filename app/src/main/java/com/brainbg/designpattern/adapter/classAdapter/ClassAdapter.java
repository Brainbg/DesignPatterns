package com.brainbg.designpattern.adapter.classAdapter;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/22
 *     desc   : 类适配器
 * </pre>
 */
public class ClassAdapter extends ConcreteClassAdaptee implements ClassTarget {

    @Override
    public void targetMethod() {
        String adapteeData = super.adapteeMethod();
        System.out.println(adapteeData);
    }

}
