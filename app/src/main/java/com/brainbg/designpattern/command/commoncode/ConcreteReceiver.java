package com.brainbg.designpattern.command.commoncode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/27
 *     desc   :
 * </pre>
 */
class ConcreteReceiver extends Receiver {

    /**
     * 具体接收
     */
    @Override
    public void operation() {
        System.out.println("具体接收");
    }
}
