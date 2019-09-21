package com.brainbg.designpattern.decorator.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :装饰者
 * </pre>
 */
abstract class Decorator extends Component {
    private Component mComponent;

    /**
     * 必要的构造方法
     *
     * @param mComponent 持有一个Component的对象引用
     */
    public Decorator(Component mComponent) {
        this.mComponent = mComponent;
    }

    /**
     * 委托给装饰者执行
     */
    @Override
    public void operation() {
        this.mComponent.operation();
    }
}
