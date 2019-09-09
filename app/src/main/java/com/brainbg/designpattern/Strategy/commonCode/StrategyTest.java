package com.brainbg.designpattern.Strategy.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/26
 *     desc   :
 * </pre>
 */
public class StrategyTest {

    public static void main(String[] args) {
        Strategy concreteStrategy1 = new ConcreteStrategy1();
        Strategy concreteStrategy2 = new ConcreteStrategy2();

        //策略1
        Context context1 = new Context(concreteStrategy1);
        context1.doSomethings();

        //策略2
        Context context2 = new Context(concreteStrategy2);
        context2.doSomethings();

    }
}
