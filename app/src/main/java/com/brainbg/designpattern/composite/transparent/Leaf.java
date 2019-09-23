package com.brainbg.designpattern.composite.transparent;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/23
 *     desc   : 叶子
 * </pre>
 */
public class Leaf extends Component {
    /**
     * 约束子类必须实现该构造函数
     *
     * @param name 节点名称
     */
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void operation(int level) {
        StringBuilder tab = new StringBuilder();
        StringBuilder line = new StringBuilder();
        for (int i = 1; i <= level; i++) {
            tab.append("    ");
            line.append(" - ");
        }
        System.out.println(tab + "╙" + line + " " + name);
    }

    @Override
    public void addChild(Component child) {
        throw new UnsupportedOperationException("叶子节点没有子节点！");
    }

    @Override
    public void removeChild(Component child) {
        throw new UnsupportedOperationException("叶子节点没有子节点！");
    }

    @Override
    public Component getChildren(int index) {
        throw new UnsupportedOperationException("叶子节点没有子节点！");
    }
}
