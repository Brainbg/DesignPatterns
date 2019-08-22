package com.brainbg.designpattern.adapter.commonCodeSimple;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/22
 *     desc   : 客户端场景
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        //原业务
        Target mTarget1 = new ConcreteTarget();
        mTarget1.targetMethod();

        //新增业务
        Target mTarget2 = new Adapter();
        mTarget2.targetMethod();
    }
}
