package com.brainbg.designpattern.proxy.agency;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/26
 *     desc   :
 * </pre>
 */
class Agency implements ICompany {
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
    }
}
