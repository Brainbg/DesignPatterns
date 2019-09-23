package com.brainbg.designpattern.composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/23
 *     desc   : 树枝
 * </pre>
 */
public class Composite extends Component {
    private List<Component> components = new ArrayList<>();

    /**
     * 约束子类必须实现该构造函数
     *
     * @param name 节点名称
     */
    public Composite(String name) {
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
        level += 1;
        if (null != components) {
            for (Component component : components) {
                component.operation(level);
            }
        }
    }

    @Override
    public void addChild(Component child) {
        components.add(child);
    }

    @Override
    public void removeChild(Component child) {
        components.remove(child);
    }

    @Override
    public Component getChildren(int index) {
        return components.get(index);
    }
}
