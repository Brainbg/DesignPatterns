package com.brainbg.designpattern.facade.logic;

import com.brainbg.designpattern.facade.commonCode.SubsystemA;
import com.brainbg.designpattern.facade.commonCode.SubsystemB;
import com.brainbg.designpattern.facade.commonCode.SubsystemC;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/25
 *     desc   :封装类
 * </pre>
 */
public class Encapsulation {

    private SubsystemA subA = new SubsystemA();
    private SubsystemB subB = new SubsystemB();
    private SubsystemC subC = new SubsystemC();

    /**
     * 封装业务逻辑
     */
    public void operation() {
        subA.operationA();
        subB.operationB();
        subC.operationC();
    }
}
