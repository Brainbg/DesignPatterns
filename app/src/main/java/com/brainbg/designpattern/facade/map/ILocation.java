package com.brainbg.designpattern.facade.map;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/25
 *     desc   : 定位系统
 * </pre>
 */
public interface ILocation {

    /**
     * 开启定位
     */
    public void startLocation();

    /**
     * 停止定位
     */
    public void stopLocation();

    /**
     * 销毁定位
     */
    public void destroyLocation();

    /**
     * 获取定位信息
     */
    public void getInfo();
}
