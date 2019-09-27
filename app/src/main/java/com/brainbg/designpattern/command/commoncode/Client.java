package com.brainbg.designpattern.command.commoncode;

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
        //创建一个调用者
        Invoker invoker = new Invoker();
        //新建接收者
        Receiver receiver = new ConcreteReceiver();
        //定义一个发送给接收者的命今
        Command command = new ConcreteCommand(receiver);
        //把命令交给调用者去执行
        invoker.setmCommand(command);
        //调用者执行命令
        invoker.exec();
    }
}
