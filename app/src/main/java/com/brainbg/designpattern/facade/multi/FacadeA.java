package com.brainbg.designpattern.facade.multi;

import com.brainbg.designpattern.facade.commonCode.Facade;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/25
 *     desc   : 新外观
 * </pre>
 */
public class FacadeA {
    private Facade facade = new Facade();

    public void methodA() {
        facade.methodA();
    }
}
