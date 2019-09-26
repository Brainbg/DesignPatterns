package com.brainbg.designpattern.proxy.force;


/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/26
 *     desc   :
 * </pre>
 */
class Company implements ICompany {

    private Agency agency;

    @Override
    public void promotion() {
        if (this.isProxy()) {
            System.out.println("推广减肥产品！");
        } else {
            System.out.println("请使用指定代理访问！");
        }
    }

    @Override
    public void sale() {
        if (this.isProxy()) {
            System.out.println("销售减肥产品！");
        } else {
            System.out.println("请使用指定代理访问！");
        }
    }

    @Override
    public ICompany getProxy() {
        this.agency = new Agency(this);
        return this.agency;
    }

    private boolean isProxy() {
        if (this.agency != null) {
            return true;
        } else {
            return false;
        }
    }
}
