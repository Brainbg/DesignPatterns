package com.brainbg.designpattern.command.perfect;


/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/27
 *     desc   :
 * </pre>
 */
public class Invoker {
    private Command mCommand;

    /**
     * 接收命令
     *
     * @param mCommand
     */
    public void setmCommand(Command mCommand) {
        this.mCommand = mCommand;
    }

    /**
     * 执行命令
     */
    public void exec() {
        this.mCommand.execute();
        System.out.println("调用者执行命令");
    }

}
