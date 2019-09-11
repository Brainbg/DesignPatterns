package com.brainbg.designpattern.flyweight;

public class ConcreteFlyWeight extends Flyweight {


    /**
     * 抽象类父类有构造带参数的构造方法，子类需要实现
     *
     * @param extrinsic
     */
    public ConcreteFlyWeight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        //业务逻辑
    }

}
