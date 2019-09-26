package com.brainbg.designpattern.proxy.addition;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/26
 *     desc   :
 * </pre>
 */
class Agency implements ICompany, Iproxy {
    private ICompany company;

    public Agency(ICompany company) {
        this.company = company;
    }

    @Override
    public void promotion() {
        this.company.promotion();
    }

    @Override
    public void sale() {
        this.company.sale();
        this.income();
    }

    @Override
    public void income() {
        System.out.println("代理商销售后，拿到提成！");
    }
}
