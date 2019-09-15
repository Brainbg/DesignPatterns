package com.brainbg.designpattern.memento.clone;

public class MementorCloneTest {
    public static void main(String[] args) {
        //创建原发器
        Originator originator = new Originator();
        //初始状态
        originator.setState("初始状态");
        System.out.println("初始状态是：" + originator.getState());
        //建立备份
        originator.createMemento();
        //修改状态
        originator.setState("修改状态");
        System.out.println("修改状态是：" + originator.getState());
        //恢复备份
        originator.restoreMementor();
        System.out.println("恢复状态是：" + originator.getState());

    }
}
