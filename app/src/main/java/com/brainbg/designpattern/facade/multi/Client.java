package com.brainbg.designpattern.facade.multi;

import com.brainbg.designpattern.facade.commonCode.Facade;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/23
 *     desc   :
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("--------第一个外观类----------");
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
        facade.methodC();
        System.out.println("--------第二个外观类----------");
        FacadeA facadeA = new FacadeA();
        facadeA.methodA();
    }
}
