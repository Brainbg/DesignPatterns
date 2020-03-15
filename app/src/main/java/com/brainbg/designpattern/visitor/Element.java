package com.brainbg.designpattern.visitor;

/**
 * <pre>
 *     author : brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/10/14
 *     desc   :
 * </pre>
 */
public abstract class Element {
    public abstract void operation();
    public abstract void accept(IVisitor visitor);
}
