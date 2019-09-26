package com.brainbg.designpattern.proxy.force;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/26
 *     desc   :
 * </pre>
 */
interface ICompany {
    /**
     * 推广
     */
    public void promotion();

    /**
     * 销售
     */
    public void sale();

    /**
     * 获取自己的代理商
     *
     * @return 代理商
     */
    public ICompany getProxy();
}
