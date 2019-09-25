package com.brainbg.designpattern.facade.map;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/25
 *     desc   : 导航系统
 * </pre>
 */
public interface INavigation {

    /**
     * 驾驶路线
     */
    public void DrivingRoutes();

    /**
     * 步行路线
     */
    public void walkingRoutes();

    /**
     * 骑行路线
     */
    public void cyclingRoutes();

    /**
     * 地铁路线
     */
    public void subwayRoutes();
}
