package com.brainbg.designpattern.command.perfect;



/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/27
 *     desc   :
 * </pre>
 */
public class ConcreteReceiver extends Receiver {

    /**
     * 具体接收
     */
    @Override
    public void operation() {
        System.out.println("具体接收");
    }
}
