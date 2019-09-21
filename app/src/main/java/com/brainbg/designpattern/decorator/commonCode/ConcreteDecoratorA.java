package com.brainbg.designpattern.decorator.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :具体装饰者A
 * </pre>
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component mComponent) {
        super(mComponent);
    }

    /**
     * 添加功能
     */
    private void addFeatureA() {
        System.out.println("添加功能A");
    }

    /**
     * 装饰方法A在父类方法前后调用皆可。
     */
    @Override
    public void operation() {
        this.addFeatureA();
        super.operation();
    }
}
