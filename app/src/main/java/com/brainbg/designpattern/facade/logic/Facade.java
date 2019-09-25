package com.brainbg.designpattern.facade.logic;

import com.brainbg.designpattern.facade.commonCode.SubsystemA;
import com.brainbg.designpattern.facade.commonCode.SubsystemB;
import com.brainbg.designpattern.facade.commonCode.SubsystemC;

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
    private SubsystemB subB = new SubsystemB();
    private Encapsulation enc = new Encapsulation();

    public void methodA() {
        this.subA.operationA();
    }

    public void methodB() {
        this.subB.operationB();
    }

    public void methodC() {
        enc.operation();
    }
}
