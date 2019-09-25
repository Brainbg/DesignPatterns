package com.brainbg.designpattern.facade.map;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/25
 *     desc   : 地图系统
 * </pre>
 */
public interface IMap {
    /**
     * 创建地图
     */
    public void onCreate();

    /**
     * 启动地图
     */
    public void onStart();

    /**
     * 销毁地图
     */
    public void onDestroy();

    /**
     * 恢复地图
     */
    public void onResume();

}
