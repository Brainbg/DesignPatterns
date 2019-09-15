package com.brainbg.designpattern.memento.commonCode;

public class Originator {
    private String state="";

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMementor() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        setState(memento.getState());
    }
}
