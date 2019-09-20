package com.brainbg.designpattern.decorator.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :
 * </pre>
 */
abstract class Component {
    /**
     * 抽象方法，可根据具体的业务逻辑增加更多。
     */
    public abstract void operate();
}
