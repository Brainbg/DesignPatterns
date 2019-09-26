package com.brainbg.designpattern.proxy.addition;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/26
 *     desc   :
 * </pre>
 */
class Client {
    public static void main(String[] args) {
        Company company = new Company();
        Agency agency = new Agency(company);
        agency.promotion();
        agency.sale();
    }
}
