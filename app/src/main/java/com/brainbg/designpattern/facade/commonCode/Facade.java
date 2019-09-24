package com.brainbg.designpattern.facade.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/23
 *     desc   :
 * </pre>
 */
public class Facade {
    //被委托的对象
    private SubsystemA subA = new SubsystemA();
    private SubsystemB subB= new SubsystemB();
    private SubsystemC subC = new SubsystemC();

    public void methodA() {
        this.subA.operationA();
    }

    public void methodB() {
        this.subB.operationB();
    }

    public void methodC() {
        this.subC.operationC();
    }
}
