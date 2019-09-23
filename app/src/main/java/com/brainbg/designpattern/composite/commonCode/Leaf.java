package com.brainbg.designpattern.composite.commonCode;

/**
 * <pre>
 *     author : brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/22
 *     desc   :
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

    /**
     * 可以覆写父类的方法
     */
    public void operation() {
        System.out.println(name);
    }
}
