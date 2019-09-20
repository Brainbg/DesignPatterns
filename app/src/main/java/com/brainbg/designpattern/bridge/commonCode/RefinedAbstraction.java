package com.brainbg.designpattern.bridge.commonCode;

/**
 * <pre>
 *     author : brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/18
 *     desc   :优化/具体抽象部分
 * </pre>
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor mImplementor) {
        super(mImplementor);
    }

    /**
     * 对父类抽象部分中的方法进行拓展或者修正。
     */
    @Override
    public void operation() {
        super.operation();
        System.out.println("拓展、修正父类");
    }
}
