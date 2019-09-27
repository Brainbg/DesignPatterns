package com.brainbg.designpattern.command.perfect;


/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/27
 *     desc   :
 * </pre>
 */
public abstract class Command {
    protected final Receiver receiver;

    protected Command(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 执行命令
     */
    public abstract void execute();
}
