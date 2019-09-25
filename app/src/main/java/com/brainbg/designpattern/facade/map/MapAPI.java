package com.brainbg.designpattern.facade.map;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/25
 *     desc   :整个地图系统的外观
 * </pre>
 */
public class MapAPI {
    private Map mMap = new Map();
    private Location mLocation = new Location();
    private Navigation mNavigation = new Navigation();

    public void xxx() {
        mMap.onCreate();
        mLocation.startLocation();
        mNavigation.cyclingRoutes();
    }
}
