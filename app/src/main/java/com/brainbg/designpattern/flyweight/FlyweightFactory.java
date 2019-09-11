package com.brainbg.designpattern.flyweight;

import java.util.HashMap;

public class FlyweightFactory {

    private static HashMap<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight;
        if (pool.containsKey(extrinsic)) {//直接从池中取出
            flyweight = pool.get(extrinsic);
        } else {//池中没有改对象，新建，并放进池中
            flyweight = new ConcreteFlyWeight(extrinsic);
            pool.put(extrinsic, flyweight);
        }
        return flyweight;

    }
}
