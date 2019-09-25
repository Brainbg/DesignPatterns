package com.brainbg.designpattern.facade.logic;


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
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
        System.out.println("------修改业务逻辑------");
        facade.methodC();
    }
}
