package com.brainbg.designpattern.facade.map;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/25
 *     desc   :
 * </pre>
 */
public class Location implements ILocation {
    @Override
    public void startLocation() {
        System.out.println("开始定位");
    }

    @Override
    public void stopLocation() {
        System.out.println("停止定位");
    }

    @Override
    public void destroyLocation() {
        System.out.println("销毁定位");
    }

    @Override
    public void getInfo() {
        System.out.println("获取定位信息");
    }
}
