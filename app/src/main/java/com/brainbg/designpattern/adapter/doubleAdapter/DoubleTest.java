package com.brainbg.designpattern.adapter.doubleAdapter;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/22
 *     desc   : 测试双向适配器模式
 * </pre>
 */
public class DoubleTest {
    public static void main(String[] args) {


        //目标通过适配器访问适配者
        DoubleAdaptee adaptee = new ConcreteDoubleAdaptee();
        DoubleTarget doubleAdapter1 = new DoubleAdapter(adaptee);
        doubleAdapter1.targetMethod();

        //适配者通过适配器访问目标
        DoubleTarget target = new ConcreteDoubleTarget();
        DoubleAdaptee doubleAdapter2 = new DoubleAdapter(target);
        doubleAdapter2.adapteeMethod();
    }
}
