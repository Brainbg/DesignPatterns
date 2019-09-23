package com.brainbg.designpattern.composite.commonCode;

/**
 * <pre>
 *     author : brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/22
 *     desc   :组件
 * </pre>
 */
public abstract class Component {
    protected String name;

    /**
     * 约束子类必须实现该构造函数
     *
     * @param name 节点名称
     */
    public Component(String name) {
        this.name = name;
    }

    /**
     * 具体的逻辑由子类实现
     */
    public abstract void operation(int level);

}
