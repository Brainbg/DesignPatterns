package com.brainbg.designpattern.builder.withTemplateMethod;

import java.util.ArrayList;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail
 *     time   : 2019/08/19
 *     desc   :车辆模型
 * </pre>
 */
public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {


    }
}
