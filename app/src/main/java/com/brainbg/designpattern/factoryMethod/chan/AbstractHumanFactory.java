package com.brainbg.designpattern.factoryMethod.chan;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail
 *     time   : 2019/08/20
 *     desc   :抽象人类创造工厂
 * </pre>
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
