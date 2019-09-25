package com.brainbg.designpattern.facade.map;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/25
 *     desc   :
 * </pre>
 */
public class Map implements IMap {
    @Override
    public void onCreate() {
        System.out.println("创建地图");
    }

    @Override
    public void onStart() {
        System.out.println("启动地图");
    }

    @Override
    public void onDestroy() {
        System.out.println("销毁地图");
    }

    @Override
    public void onResume() {
        System.out.println("恢复地图");
    }
}
