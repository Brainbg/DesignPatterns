package com.brainbg.designpattern.factoryMethod;

public class BFactory extends DataLineFactory {
    @Override
    public DataLine product() {
        return new AndroidDataLine();
    }
}
