package com.brainbg.designpattern.flyweight;

public abstract class Flyweight {
    private String intrinsic;
    //防止多次修改
    protected final String extrinsic;

    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operate();

    public String getIntrinsic() {
        return this.intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
