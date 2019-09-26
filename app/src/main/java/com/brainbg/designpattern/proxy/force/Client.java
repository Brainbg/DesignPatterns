package com.brainbg.designpattern.proxy.force;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/26
 *     desc   :
 * </pre>
 */
public class Client {

    public static void main(String[] args) {
        //直接访问真实主体,无效
        System.out.println("----------直接访问真实主体----------");
        Company company = new Company();
        company.promotion();
        company.promotion();

        //直接代理代理访问,无效
        System.out.println("----------直接代理代理访问----------");
        Company company1 = new Company();
        Agency agency = new Agency(company1);
        agency.promotion();
        agency.sale();

        //必须强制使用真实主体指定的代理
        System.out.println("----------强制代理----------");
        ICompany proxy = new Company().getProxy();
        proxy.promotion();
        proxy.sale();


    }
}
