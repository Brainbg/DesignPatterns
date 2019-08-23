package com.brainbg.designpattern.adapter.classAdapter;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/22
 *     desc   : 测试类适配器模式
 * </pre>
 */
public class ClassTest {
    public static void main(String[] args) {
        //原业务
        ClassTarget mTarget1 = new ConcreteClassTarget();
        mTarget1.targetMethod();

        //新增业务
        ClassTarget mTarget2 = new ClassAdapter();
        mTarget2.targetMethod();
    }
}
