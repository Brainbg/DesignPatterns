package com.brainbg.designpattern.memento.commonCode;

public class MementoTest {
    public static void main(String[] args) {
        //原发器
        Originator originator = new Originator();
        //备忘录
        Memento mementor = originator.createMementor();
        //负责人
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(mementor);

        //恢复备份
        originator.restoreMemento(caretaker.getMemento());
    }
}
