package com.brainbg.designpattern.adapter.objectAdapter;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/22
 *     desc   : 测试 对象适配器 模式
 * </pre>
 */
public class ObjectTest {
    public static void main(String[] args) {
        //原业务
        ObjectTarget mTarget1 = new ConcreteObjectTarget();
        mTarget1.targetMethod();

        //新增业务
        ObjectAdaptee adaptee = new ConcreteObjectAdaptee();
        ObjectAdapter adapter = new ObjectAdapter(adaptee);
        adapter.targetMethod();
    }
}
