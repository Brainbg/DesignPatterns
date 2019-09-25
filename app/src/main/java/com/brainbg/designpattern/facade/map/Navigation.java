package com.brainbg.designpattern.facade.map;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/25
 *     desc   :
 * </pre>
 */
public class Navigation implements INavigation {
    @Override
    public void DrivingRoutes() {
        System.out.println("驾驶路线");
    }

    @Override
    public void walkingRoutes() {
        System.out.println("步行路线");
    }

    @Override
    public void cyclingRoutes() {
        System.out.println("骑行路线");
    }

    @Override
    public void subwayRoutes() {
        System.out.println("地铁路线");
    }
}
