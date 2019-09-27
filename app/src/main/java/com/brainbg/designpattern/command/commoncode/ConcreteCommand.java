package com.brainbg.designpattern.command.commoncode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/27
 *     desc   :
 * </pre>
 */
class ConcreteCommand extends Command {
    private Receiver mReceiver;

    public ConcreteCommand(Receiver mReceiver) {
        this.mReceiver = mReceiver;
    }

    /**
     * 具体执行
     */
    @Override
    public void execute() {
        this.mReceiver.operation();
        System.out.println("具体执行");
    }
}
