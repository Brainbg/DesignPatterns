package com.brainbg.designpattern.decorator.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :
 * </pre>
 */
class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component mComponent) {
        super(mComponent);
    }

    /**
     * 自定义装饰方法A
     */
    private void methodA() {
        System.out.println("装饰方法A");
    }

    /**
     * 装饰方法A在父类方法前后调用皆可。
     */
    @Override
    public void operate() {
        this.methodA();
        super.operate();
    }
}
