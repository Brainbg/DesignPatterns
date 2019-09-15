package com.brainbg.designpattern.memento.clone;

 class Originator implements Cloneable {
    private Originator backup;
    public String state = "";

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void createMemento() {
        try {
            this.backup = (Originator) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public void restoreMementor() {
        this.setState(this.backup.getState());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
