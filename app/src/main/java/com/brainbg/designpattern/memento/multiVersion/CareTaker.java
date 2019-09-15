package com.brainbg.designpattern.memento.multiVersion;

import java.util.HashMap;

class CareTaker {
    private HashMap<String, Memento> mHashMap = new HashMap<>();

    public Memento getMemento(String id) {
        return mHashMap.get(id);
    }

    public void setMemento(String id, Memento memento) {
        this.mHashMap.put(id, memento);
    }
}
