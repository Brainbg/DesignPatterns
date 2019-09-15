package com.brainbg.designpattern.memento.encapsulation;

public class Test {
    public static void main(String[] args) {

        Originator originator = new Originator();
        originator.setState("初始化");

        System.out.println("初始后：" + originator.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("修改");
        System.out.println("修改后：" + originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复后：" + originator.getState());
    }
}
