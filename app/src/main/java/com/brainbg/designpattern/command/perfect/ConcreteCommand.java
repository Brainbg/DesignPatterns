package com.brainbg.designpattern.command.perfect;


/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/27
 *     desc   :
 * </pre>
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand() {
        super(new ConcreteReceiver());
    }

    protected ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        super.receiver.operation();
    }
}
