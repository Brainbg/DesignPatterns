package com.brainbg.designpattern.proxy.general;

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

    public Agency() {
        try {
            this.company = new Company(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
