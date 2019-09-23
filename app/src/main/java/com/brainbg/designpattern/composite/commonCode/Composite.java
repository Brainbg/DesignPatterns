package com.brainbg.designpattern.composite.commonCode;

import java.util.ArrayList;

/**
 * <pre>
 *     author : brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/22
 *     desc   :树枝
 * </pre>
 */
public class Composite extends Component {
    //存储节点
    private ArrayList<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    /**
     * 添加子节点
     *
     * @param child 节点
     */
    public void addChild(Component child) {
        this.components.add(child);
    }

    /**
     * 移除子节点
     *
     * @param child 节点
     */
    public void removeChild(Component child) {
        this.components.remove(child);
    }

    public Component getChildren(int index) {
        return this.components.get(index);
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
        level += 1;
        if (null != components) {
            for (Component component : components) {
                component.operation(level);
            }
        }
    }
}
