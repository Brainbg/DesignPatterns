package com.brainbg.designpattern.factoryMethod;

public class AFactory extends DataLineFactory {
    @Override
    public DataLine product() {
        return new AppleDataLine();
    }
}
