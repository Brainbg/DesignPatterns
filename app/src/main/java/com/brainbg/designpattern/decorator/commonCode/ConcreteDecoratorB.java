package com.brainbg.designpattern.decorator.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :
 * </pre>
 */
class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component mComponent) {
        super(mComponent);
    }

    private void methodB() {
        System.out.println("装饰方法B");
    }

    /**
     * 装饰方法B在父类方法前后调用皆可。
     */
    @Override
    public void operate() {
        super.operate();
        this.methodB();
    }
}
