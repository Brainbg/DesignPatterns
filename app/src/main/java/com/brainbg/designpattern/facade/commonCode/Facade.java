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
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();

    public void methodA() {
        this.classA.operationA();
    }

    public void methodB() {
        this.classB.operationB();
    }

    public void methodC() {
        this.classC.operationC();
    }
}
