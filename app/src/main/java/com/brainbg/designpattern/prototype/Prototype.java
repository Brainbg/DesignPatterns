package com.brainbg.designpattern.prototype;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/08/29
 *     desc   :原型模式
 * </pre>
 */
public class Prototype implements Cloneable {

    public Prototype() {
        System.out.println("Prototype的构造函数被执行了！");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
