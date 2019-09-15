package com.brainbg.designpattern.memento.multiProperty;

public class Test {
    public static void main(String[] args) {
        //原发器
        Originator originator = new Originator();
        //初始化
        originator.setState1("设计");
        originator.setState2("模式");
        originator.setState3("之禅");
        System.out.println("初始化后：" + originator.toString());
        //创建管理员
        CareTaker careTaker = new CareTaker();
        //创建备忘录
        careTaker.setMemento(originator.createMemento());
        //修改状态
        originator.setState1("备忘录");
        originator.setState2("设计");
        originator.setState3("模式");
        System.out.println("修改状态后：" + originator.toString());
        //恢复备忘录
        originator.restoreMemento(careTaker.getMemento());
        System.out.println("恢复备份后：" + originator.toString());
    }
}
