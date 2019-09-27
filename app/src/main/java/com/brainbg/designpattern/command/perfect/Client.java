package com.brainbg.designpattern.command.perfect;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/27
 *     desc   :
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command command = new ConcreteCommand();
        invoker.setmCommand(command);
        invoker.exec();
    }
}
