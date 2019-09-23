package com.brainbg.designpattern.composite.commonCode;

/**
 * <pre>
 *     author : brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/22
 *     desc   :
 * </pre>
 */
public class Client {

    public static void main(String[] args) {
        //创建一个根节点
        Composite root = new Composite("Root");

        //新建树枝节点
        Composite branchA = new Composite("BranchA");
        Composite branchB = new Composite("Branch");

        //新建叶子节点
        Leaf leafA = new Leaf("LeafA");
        Leaf leafB = new Leaf("LeafB");

        //树枝节点添加叶子节点
        branchA.addChild(leafA);
        branchB.addChild(leafB);

        //根节点添加枝干节点
        root.addChild(branchA);
        root.addChild(branchB);

        //执行相关逻辑
        root.operation();
    }

}
