package com.brainbg.designpattern.proxy.dynamic;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/26
 *     desc   :
 * </pre>
 */
class Company implements ICompany {
    @Override
    public void promotion() {
        System.out.println("推广减肥产品！");
    }

    @Override
    public void sale() {
        System.out.println("销售减肥产品！");
    }
}
