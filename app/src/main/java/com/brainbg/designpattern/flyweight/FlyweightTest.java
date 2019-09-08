package com.brainbg.designpattern.flyweight;

public class FlyweightTest {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            String subject = "ke" + i;
            Flyweight flyweight = FlyweightFactory.getFlyweight(subject);

        }
    }
}
