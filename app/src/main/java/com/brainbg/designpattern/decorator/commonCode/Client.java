package com.brainbg.designpattern.decorator.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        //第一次装饰
        component = new ConcreteDecoratorA(component);
        //在第一次装饰基础上进行第二次装饰，当然也可以单独装饰
        component = new ConcreteDecoratorB(component);
        //展示装饰效果
        component.operation();

    }

}
