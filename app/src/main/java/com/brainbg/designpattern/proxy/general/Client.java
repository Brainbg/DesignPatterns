package com.brainbg.designpattern.proxy.general;

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
        Agency agency = new Agency();
        agency.promotion();
        agency.sale();
    }
}
