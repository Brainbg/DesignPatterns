package com.brainbg.designpattern.memento.multiVersion;

public class Test {
    public static void main(String[] args) {
        //原发器
        Originator originator = new Originator();
        //创建管理员
        CareTaker careTaker = new CareTaker();
        //第一版
        originator.setState1("设计模式之禅");
        originator.setState2("秦小波");
        originator.setState3("第1版");
        System.out.println("发行第1版：" + originator.toString());
        careTaker.setMemento("v1.0.0", originator.createMemento());
        //第二版
        originator.setState1("设计模式之禅-修订");
        originator.setState2("秦小波");
        originator.setState3("第2版");
        System.out.println("发行第2版：" + originator.toString());
        careTaker.setMemento("v2.0.0", originator.createMemento());

        //获取第1版
        originator.restoreMemento(careTaker.getMemento("v1.0.0"));
        System.out.println("获取第1版信息：" + originator.toString());
    }
}
