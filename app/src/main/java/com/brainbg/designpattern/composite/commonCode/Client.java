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
        Composite root = new Composite(" Root");

        //新建树枝节点
        Composite branchA = new Composite("BranchA");
        Composite branchB = new Composite("Branch");

        //新建叶子节点
        Leaf leafA = new Leaf("LeafA");
        Leaf leafB = new Leaf("LeafB");

//        leafA.getChildren(0);

        //树枝节点添加叶子节点
        branchA.addChild(leafA);
        branchB.addChild(leafB);

        //根节点添加枝干节点
        root.addChild(branchA);
        root.addChild(branchB);

        System.out.println("--------获取组合结构------------");
        //执行相关逻辑
        root.operation(0);

        System.out.println("--------获取根子节点------------");
        //根获取子节点
        root.getChildren(0).operation(1);

        System.out.println("--------获取树枝子节点------------");
        //树枝获取子节点
        branchA.getChildren(0).operation(2);

        System.out.println("--------获取叶子本身节点------------");
        //叶子没有子节点
        leafA.operation(2);
    }
}
