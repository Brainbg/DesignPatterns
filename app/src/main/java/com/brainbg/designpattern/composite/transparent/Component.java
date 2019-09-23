package com.brainbg.designpattern.composite.transparent;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/23
 *     desc   : 组件
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
     * 由子类实现具体的业务逻辑
     */
    public abstract void operation(int level);

    /**
     * 添加子节点
     *
     * @param child 子节点
     */
    public abstract void addChild(Component child);

    /**
     * 移除子节点
     *
     * @param child 子节点
     */
    public abstract void removeChild(Component child);

    /**
     * 获取子节点
     *
     * @param index 字节点对应的下标
     * @return 子节点
     */
    public abstract Component getChildren(int index);
}
