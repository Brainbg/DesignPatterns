package com.brainbg.designpattern.memento.commonCode;

 class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return this.memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
