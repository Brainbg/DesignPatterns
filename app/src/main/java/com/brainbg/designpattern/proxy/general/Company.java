package com.brainbg.designpattern.proxy.general;



/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/26
 *     desc   :
 * </pre>
 */
 class Company implements ICompany {

    public Company(ICompany company) throws Exception {
        if (company == null) {
              throw new Exception("不能直接访问公司总部！");
        }
    }

    @Override
    public void promotion() {
        System.out.println("推广减肥产品！");
    }

    @Override
    public void sale() {
        System.out.println("销售减肥产品！");
    }
}
